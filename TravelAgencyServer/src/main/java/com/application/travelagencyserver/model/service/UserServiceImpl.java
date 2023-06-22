package com.application.travelagencyserver.model.service;

import com.application.travelagencyserver.model.dao.UserRepository;
import com.application.travelagencyserver.model.entity.User;
import com.application.travelagencyserver.model.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
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
