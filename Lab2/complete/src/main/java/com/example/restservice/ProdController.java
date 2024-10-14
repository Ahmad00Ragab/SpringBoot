package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@RestController
public class ProdController {
    
    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @GetMapping("/prod/credentials")
    public String getProdCredentials() {
        return "Production Credentials - Username: " + username + ", Password: " + password;
    }
}
