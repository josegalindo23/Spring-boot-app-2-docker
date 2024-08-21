package com.example.app_basic_2_docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Welcome2Docker {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Dockerized Spring Boot App!";
    }

    @GetMapping("/greet")
    public String greet(){
        return "Greetings from the Dockerized Spring Boot App!";
    }

    @GetMapping("/bye")
    public String goodbye(){
        return "Goodbye from Dockerized Spring Boot App!";
    }
}
