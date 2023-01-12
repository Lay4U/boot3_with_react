package com.example.webdev101.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/")
    public String healthCheck(){
        return "this service is up and running...";
    }
}
