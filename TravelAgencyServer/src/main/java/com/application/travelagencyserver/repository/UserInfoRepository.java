package com.application.travelagencyserver.repository;

import com.application.travelagencyserver.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
