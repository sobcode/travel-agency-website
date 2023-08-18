package com.application.travelagencyserver.service.interfaces;

import com.application.travelagencyserver.dto.user.UpdateUserDTO;
import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
import com.application.travelagencyserver.model.User;

import java.util.List;

public interface UserService {

    User findUserByEmail(String email);
    User saveUser(User user);

    void deleteUserById(int id);

    List<User> findAllUsers();

    User findUserById(int id);

    User updateUser(UpdateUserDTO updateUserDTO) throws WrongIdWhileCreateOrUpdateException;
}
