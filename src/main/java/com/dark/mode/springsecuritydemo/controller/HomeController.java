package com.dark.mode.springsecuritydemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Authentication a, Model m) {
        m.addAttribute("user", a.getName());
        return "index";
    }
}
