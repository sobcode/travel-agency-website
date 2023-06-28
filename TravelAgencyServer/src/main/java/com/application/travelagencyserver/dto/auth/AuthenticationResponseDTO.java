package com.application.travelagencyserver.dto.auth;

public class AuthenticationResponseDTO {
    private String token;
    private String username;

    public AuthenticationResponseDTO() {
    }

    public AuthenticationResponseDTO(String token, String username) {
        this.token = token;
        this.username = username;
    }

    @Override
    public String toString() {
        return "AuthenticationResponse{" +
                "token='" + token + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
