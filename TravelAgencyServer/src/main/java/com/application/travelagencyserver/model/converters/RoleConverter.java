package com.application.travelagencyserver.model.converters;

import com.application.travelagencyserver.model.User;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<User.Role, String> {
    @Override
    public String convertToDatabaseColumn(User.Role role) {
        if(role == null){
            return null;
        }
        return role.toString();
    }

    @Override
    public User.Role convertToEntityAttribute(String s) {
        if(s == null){
            return null;
        }
        return User.Role.valueOf(s);
    }
}
