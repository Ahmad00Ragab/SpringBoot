package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    // @GetMapping("/hello")
    // @PostMapping("/hello")
    @RequestMapping("/hello") 
    public String sayHello() {
        return "Hello, Sprig Boot Community, Lab2!";
    }
}

