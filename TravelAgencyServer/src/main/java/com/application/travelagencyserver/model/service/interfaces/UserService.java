package com.application.travelagencyserver.model.service.interfaces;

import com.application.travelagencyserver.model.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    void deleteUserById(int id);

    List<User> findAllUsers();

    User findUserById(int id);


}
