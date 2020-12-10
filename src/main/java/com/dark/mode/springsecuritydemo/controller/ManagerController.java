package com.dark.mode.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {

    @RequestMapping("/manager")
    public String manager() {
        return "/roles/manager";
    }
}
