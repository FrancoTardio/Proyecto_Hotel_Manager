package com.app.hotelmanager.controllers;

import com.app.hotelmanager.dtos.CustomerDTO;
import com.app.hotelmanager.repository.CustomerRepository;
import com.app.hotelmanager.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerService customerService;
@PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customer){
    CustomerDTO savedCustomerDTO = customerService.createCustomer(customer);
    return new ResponseEntity<>(savedCustomerDTO, HttpStatus.CREATED);
    }
}
