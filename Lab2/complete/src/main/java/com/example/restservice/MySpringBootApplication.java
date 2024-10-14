package com.example.restservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MySpringBootApplication.class);
        // app.setAdditionalProfiles("dev");
        app.setAdditionalProfiles("prod");
        app.run(args);
    }
}

