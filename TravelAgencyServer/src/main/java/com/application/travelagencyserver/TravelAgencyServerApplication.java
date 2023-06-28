package com.application.travelagencyserver;

import com.application.travelagencyserver.service.interfaces.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TravelAgencyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyServerApplication.class, args);
    }
}
