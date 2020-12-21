package com.dark.mode.springsecuritydemo.controller;

import com.dark.mode.springsecuritydemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/list")
    public String customers(@RequestParam(required = false) String size,
                            @RequestParam(required = false) String page, Model model) {
        int pageTemp = 0;
        int sizeTemp = 10;

        if (page != null && !page.isEmpty()) {
            pageTemp = Integer.parseInt(page) - 1;
        }

        if (size != null && !size.isEmpty()) {
            sizeTemp = Integer.parseInt(size);
        }

        model.addAttribute("customers", customerService.paginateCustomers(PageRequest.of(pageTemp, sizeTemp)));
        return "customers";
    }
}
