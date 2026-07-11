package com.example.oauth_demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "OAuth Demo Home";
    }

    @GetMapping("/user")
    public Object user(@AuthenticationPrincipal OidcUser user) {
        return user.getClaims();
    }
}