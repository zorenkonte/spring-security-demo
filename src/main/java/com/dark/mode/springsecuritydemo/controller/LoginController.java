package com.dark.mode.springsecuritydemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Authentication a) {
        return (a != null && a.isAuthenticated()) ? "redirect:/home" : "login";
    }
}
