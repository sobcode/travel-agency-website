package com.application.travelagencyserver.security;

import com.application.travelagencyserver.model.User;
import com.application.travelagencyserver.security.jwt.JwtUserFactory;
import com.application.travelagencyserver.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private UserService userService;

    @Autowired
    public JwtUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findUserByEmail(email);

        if(user == null){
            throw new UsernameNotFoundException("User with email " + email + " not found!");
        }

        return JwtUserFactory.createJwtUser(user);
    }
}
