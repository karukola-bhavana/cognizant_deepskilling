package com.example.oauth_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public Endpoint";
    }

    @GetMapping("/secure")
    public String secure() {
        return "This is a secure endpoint";
    }
}