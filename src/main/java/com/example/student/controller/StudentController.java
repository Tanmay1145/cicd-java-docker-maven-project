package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @GetMapping("/")
    public String hello() {
        return "Welcome to Student Management API";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}
