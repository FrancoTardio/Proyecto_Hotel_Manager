package com.app.hotelmanager.maperdtos;

import com.app.hotelmanager.dtos.CustomerDTO;
import com.app.hotelmanager.entities.Customer;

public class CustomerMapper {
public static  CustomerDTO mapCustomerToCustomerDTO(Customer customer) {
return new CustomerDTO(
        customer.getId(),
        customer.getFirstName(),
        customer.getLastName(),
        customer.getEmail(),
        customer.getPassword(),
        customer.getPhoneNumber()
    );
}
public static  Customer mapCustomerDTOToCustomer(CustomerDTO customerDTO) {
    Customer customer = new Customer();
    customer.setId(customerDTO.getId());
    customer.setFirstName(customerDTO.getFirstName());
    customer.setLastName(customerDTO.getLastName());
    customer.setEmail(customerDTO.getEmail());
    customer.setPassword(customerDTO.getPassword());
    customer.setPhoneNumber(customerDTO.getPhoneNumber());
    return customer;
}
}
