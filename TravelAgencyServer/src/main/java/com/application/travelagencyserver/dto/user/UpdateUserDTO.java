package com.application.travelagencyserver.dto.user;

import com.application.travelagencyserver.model.User;
import com.application.travelagencyserver.model.UserInfo;

public class UpdateUserDTO {
    private int id;

    private String email;

    private User.Role role;

    private User.Status status;

    private UserInfo userInfo;


    public UpdateUserDTO() {
    }

    public UpdateUserDTO(int id, String email, User.Role role, User.Status status, UserInfo userInfo) {
        this.id = id;
        this.email = email;
        this.role = role;
        this.status = status;
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "UpdateUserDTO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", status=" + status +
                ", userInfo=" + userInfo +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User.Role getRole() {
        return role;
    }

    public void setRole(User.Role role) {
        this.role = role;
    }

    public User.Status getStatus() {
        return status;
    }

    public void setStatus(User.Status status) {
        this.status = status;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
