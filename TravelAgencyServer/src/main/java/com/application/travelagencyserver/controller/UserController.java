package com.application.travelagencyserver.controller;

import com.application.travelagencyserver.dto.user.UpdateUserDTO;
import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
import com.application.travelagencyserver.model.User;
import com.application.travelagencyserver.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable int userId) {
        return ResponseEntity.ok(userService.findUserById(userId));
    }

//    @PostMapping("/")
//    public ResponseEntity<User> addUser(@RequestBody User user) {
//        user = userService.saveUser(user);
//
//        return ResponseEntity.ok(user);
//    }

    @PutMapping("/")
    public ResponseEntity<User> updateUser(@RequestBody UpdateUserDTO updateUserDTO)
            throws WrongIdWhileCreateOrUpdateException {
        return ResponseEntity.ok(
                userService.updateUser(updateUserDTO));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<User> deleteUser(@PathVariable int userId) {
        userService.deleteUserById(userId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
