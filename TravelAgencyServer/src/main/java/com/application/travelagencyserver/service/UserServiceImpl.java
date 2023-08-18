package com.application.travelagencyserver.service;

import com.application.travelagencyserver.dto.auth.AuthenticationResponseDTO;
import com.application.travelagencyserver.dto.auth.LoginRequestDTO;
import com.application.travelagencyserver.dto.auth.RegisterRequestDTO;
import com.application.travelagencyserver.dto.user.UpdateUserDTO;
import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
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
import java.util.NoSuchElementException;
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
        User user = findUserById(id);

        if(user == null){
            throw new NoSuchElementException("There is no user with id " + id + " in the database!");
        }

        user.setStatus(User.Status.Deleted);
        user.setId(-1 * user.getId());
        user.setEmail("!" + user.getEmail());
        user.getUserInfo().setPaymentMethods(null);
        saveUser(user);
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

    @Override
    public User updateUser(UpdateUserDTO updateUserDTO) throws WrongIdWhileCreateOrUpdateException {
        if (updateUserDTO.getId() == 0) {
            throw new WrongIdWhileCreateOrUpdateException("User id must be specified while updating!");
        }

        User actualUser = findUserById(updateUserDTO.getId());

        // merge 2 users

        //return userRepository.save(user);
        return null;
    }

    private User mergeUsers(User actualUser, UpdateUserDTO updateUserDTO) {



        return null;
    }
}
