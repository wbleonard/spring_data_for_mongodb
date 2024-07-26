package com.att.treasurehunt.controller;

import com.att.treasurehunt.entity.Customer;
import com.att.treasurehunt.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        System.out.println("getCustomerById called with id: " + id);

        Optional<Customer> customerOptional = customerService.findById(id);
        return customerOptional.map(customer -> new ResponseEntity<>(customer, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    private static final int MAX_PAGE_SIZE = 20;

    @GetMapping("/by-plan")
    public Page<Customer> getCustomersByPlanName(
            @RequestParam String planName,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        System.out.println("getCustomersByPlanName called with planName: " + planName);
        
        if (size > MAX_PAGE_SIZE) {
            size = MAX_PAGE_SIZE;
        }
        
        Pageable pageable = PageRequest.of(page, size);
        return customerService.findCustomersByPlanName(planName, pageable);
    }

    @GetMapping("/search")
    public Page<Customer> searchCustomers(
        @RequestParam String query, Pageable pageable,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size) {        
        
        return customerService.searchCustomers(query, pageable);
    }
}