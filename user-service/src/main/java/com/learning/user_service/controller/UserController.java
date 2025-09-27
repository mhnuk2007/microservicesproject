package com.learning.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users") // Note: The API Gateway strips the '/api' prefix
public class UserController {

    @GetMapping("/status")
    public String getStatus() {
        return "User Service is UP and running on port 8081";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return "Details for User ID: " + id + " (from User Service)";
    }
}