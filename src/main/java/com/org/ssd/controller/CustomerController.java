package com.org.ssd.controller;

import com.org.ssd.modal.CustomerClass;
import com.org.ssd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    public void createCustomerRecords(@RequestBody CustomerClass customerClass){
        customerService.createCustomerRecords(customerClass);
    }
    @GetMapping("/getByCustomerId/{customerId}")
    public Optional<CustomerClass> getByCustomerId(@PathVariable Integer customerId ){
        Optional<CustomerClass> rrr =   customerService.getByCustomerId(customerId);
        return rrr;
    }



}
