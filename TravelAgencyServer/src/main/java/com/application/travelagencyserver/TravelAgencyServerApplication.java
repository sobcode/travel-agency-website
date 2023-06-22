package com.application.travelagencyserver;

import com.application.travelagencyserver.model.service.interfaces.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelAgencyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserService userService){
        return runner -> {
            createEntities(userService);
        };
    }


    private void createEntities(UserService userService) {
        //userService.create(new User("nanana@gmail.com", "blablanecar", User.Role.User, User.Status.Unblocked));
//        User user = userService.getById(4);
//        user.setEmail("king@gmail.com");
//        user.setUserInfo(new UserInfo("Artem", "Sobko", "380666174869"));
//        userService.update(user);
        System.out.println(userService.findAllUsers());
    }
}
