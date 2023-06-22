package com.application.travelagencyserver.model.dao;

import com.application.travelagencyserver.model.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
