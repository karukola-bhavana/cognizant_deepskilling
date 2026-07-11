package com.example.jwt_demo.controller;

import com.example.jwt_demo.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/token")
    public String generateToken() {
        return jwtTokenProvider.createToken("cognizant-user");
    }
}