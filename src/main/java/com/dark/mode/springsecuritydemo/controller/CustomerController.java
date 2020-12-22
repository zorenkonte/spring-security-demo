package com.dark.mode.springsecuritydemo.controller;

import com.dark.mode.springsecuritydemo.model.Customer;
import com.dark.mode.springsecuritydemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;
    private Customer customer;
    private boolean updateSuccess;

    @Autowired
    public CustomerController(CustomerService customerService, Customer customer) {
        this.customerService = customerService;
        this.customer = customer;
    }

    @RequestMapping("/list")
    public String customers(@RequestParam(required = false) String size,
                            @RequestParam(required = false) String page,
                            Model model) {
        int pageTemp = 0;
        int sizeTemp = 10;

        if (page != null && !page.isEmpty()) {
            pageTemp = Integer.parseInt(page) - 1;
        }

        if (size != null && !size.isEmpty()) {
            sizeTemp = Integer.parseInt(size);
        }

        model.addAttribute("customers", customerService.paginateCustomers(PageRequest.of(pageTemp, sizeTemp)));
        model.addAttribute("updateSuccess", updateSuccess);
        model.addAttribute("id", customer.getId());
        updateSuccess = false;
        return "customers";
    }

    @RequestMapping("/update/{id}")
    public String customerUpdate(@PathVariable Integer id, Model model) {
        customer = customerService.customer(id)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found :" + id));
        model.addAttribute(customer);
        return "customer-update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Customer c, HttpServletRequest request) {
        fillCustomer(c);
        customerService.save(customer);
        updateSuccess = true;
        return String.format("redirect:%s", request.getHeader("referer"));
    }

    private void fillCustomer(Customer c) {
        customer.setFirstName(c.getFirstName());
        customer.setLastName(c.getLastName());
        customer.setEmail(c.getEmail());
    }
}
