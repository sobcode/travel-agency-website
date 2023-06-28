package com.application.travelagencyserver.dto.auth;

public class RegisterRequestDTO {
    private String email;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;

    public RegisterRequestDTO() {
    }

    public RegisterRequestDTO(String email, String password, String name, String surname, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "RegisterRequestDTO{" +
                "email='" + email + '\'' +
                ", password='" + "***" + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
