package com.application.travelagencyserver.security.jwt;

import com.application.travelagencyserver.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

public class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser createJwtUser(User user){
        return new JwtUser(user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getStatus().equals(User.Status.Active),
                mapRoleToGrantedAuthorities(user.getRole()));
    }

    private static List<GrantedAuthority> mapRoleToGrantedAuthorities(User.Role role){
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role.name()));

        return authorities;
    }
}
