package com.app.hotelmanager.service;

import com.app.hotelmanager.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customer);
    List<CustomerDTO> getAllCustomers();
}
