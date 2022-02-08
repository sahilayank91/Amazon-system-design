package com.example.amazonsystemdesign.Controller;

import com.example.amazonsystemdesign.Model.Customer;
import com.example.amazonsystemdesign.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @PostMapping(value="/addCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    private Boolean addCustomer(Customer customer){
        customerServices.addCustomer(customer);
        return true;
    }

    @PostMapping(value="/updateCustomer")
    private Boolean updateCustomer(Customer customer){
        customerServices.addCustomer(customer);
        return true;
    }

    @GetMapping(value="/getAllCustomer")
    private List<Customer> updateCustomer(){
        return customerServices.getAllCustomer();
    }
}
