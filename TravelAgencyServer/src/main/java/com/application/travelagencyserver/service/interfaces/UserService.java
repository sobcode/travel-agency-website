package com.application.travelagencyserver.service.interfaces;

import com.application.travelagencyserver.model.User;

import java.util.List;

public interface UserService {

    User findUserByEmail(String email);
    User saveUser(User user);

    void deleteUserById(int id);

    List<User> findAllUsers();

    User findUserById(int id);


}
