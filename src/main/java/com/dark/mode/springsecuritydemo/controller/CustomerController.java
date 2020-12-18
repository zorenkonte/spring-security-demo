package com.dark.mode.springsecuritydemo.controller;

import com.dark.mode.springsecuritydemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/list")
    public String customers(Model model) {
        model.addAttribute("customers", customerService.customers());
        return "customers";
    }
}
