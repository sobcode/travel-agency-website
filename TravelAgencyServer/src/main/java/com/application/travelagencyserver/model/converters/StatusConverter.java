package com.application.travelagencyserver.model.converters;

import com.application.travelagencyserver.model.User;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<User.Status, String> {
    @Override
    public String convertToDatabaseColumn(User.Status status) {
        if(status == null){
            return null;
        }
        return status.toString();
    }

    @Override
    public User.Status convertToEntityAttribute(String s) {
        if(s == null){
            return null;
        }
        return User.Status.valueOf(s);
    }
}
