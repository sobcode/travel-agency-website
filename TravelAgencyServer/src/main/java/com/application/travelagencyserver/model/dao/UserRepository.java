package com.application.travelagencyserver.model.dao;

import com.application.travelagencyserver.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);
}
