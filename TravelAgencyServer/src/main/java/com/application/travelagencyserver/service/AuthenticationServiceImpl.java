package com.application.travelagencyserver.service;

import com.application.travelagencyserver.dto.auth.AuthenticationResponseDTO;
import com.application.travelagencyserver.dto.auth.LoginRequestDTO;
import com.application.travelagencyserver.dto.auth.RegisterRequestDTO;
import com.application.travelagencyserver.exception.AuthenticationException;
import com.application.travelagencyserver.model.User;
import com.application.travelagencyserver.model.UserInfo;
import com.application.travelagencyserver.repository.UserRepository;
import com.application.travelagencyserver.security.jwt.JwtTokenProvider;
import com.application.travelagencyserver.service.interfaces.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthenticationServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder,
                           JwtTokenProvider jwtTokenProvider, AuthenticationManager authenticationManager){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenProvider = jwtTokenProvider;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public AuthenticationResponseDTO register(RegisterRequestDTO registerRequestDTO) {
        if(userRepository.findUserByEmail(registerRequestDTO.getEmail()) != null) {
            throw new AuthenticationException("User with email " + registerRequestDTO.getEmail() + " is already exists|!");
        }

        User user = new User(registerRequestDTO.getEmail(),
                passwordEncoder.encode(registerRequestDTO.getPassword()),
                User.Role.User,
                User.Status.Active);
        user.setUserInfo(new UserInfo(registerRequestDTO.getName(),
                registerRequestDTO.getSurname(),
                registerRequestDTO.getPhoneNumber()));

        user = userRepository.save(user);
        String token = jwtTokenProvider.createToken(user.getEmail(), user.getRole());

        return new AuthenticationResponseDTO(token, user.getEmail());
    }

    @Override
    public AuthenticationResponseDTO login(LoginRequestDTO loginRequestDTO) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequestDTO.getEmail(), loginRequestDTO.getPassword()));

        User user = userRepository.findUserByEmail(loginRequestDTO.getEmail());

        if(user == null){
            throw new UsernameNotFoundException("User with email " + loginRequestDTO.getEmail() + " not found!");
        }

        String token = jwtTokenProvider.createToken(user.getEmail(), user.getRole());

        return new AuthenticationResponseDTO(token, user.getEmail());
    }
}
