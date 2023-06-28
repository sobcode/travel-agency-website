package com.application.travelagencyserver.service;

import com.application.travelagencyserver.dto.auth.AuthenticationResponseDTO;
import com.application.travelagencyserver.dto.auth.LoginRequestDTO;
import com.application.travelagencyserver.dto.auth.RegisterRequestDTO;
import com.application.travelagencyserver.model.UserInfo;
import com.application.travelagencyserver.repository.UserRepository;
import com.application.travelagencyserver.model.User;
import com.application.travelagencyserver.security.jwt.JwtTokenProvider;
import com.application.travelagencyserver.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) {
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if(optional.isPresent()){
            user = optional.get();
        }
        return user;
    }
}
