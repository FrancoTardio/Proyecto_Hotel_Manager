package com.app.hotelmanager.service.impls;

import com.app.hotelmanager.service.CustomerService;
import com.app.hotelmanager.dtos.CustomerDTO;
import com.app.hotelmanager.entities.Customer;
import com.app.hotelmanager.repository.CustomerRepository;
import com.app.hotelmanager.maperdtos.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpls implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO){
        Customer customer = CustomerMapper.mapCustomerDTOToCustomer(customerDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return CustomerMapper.mapCustomerToCustomerDTO(savedCustomer);
    }
    @Override
    public List<CustomerDTO> getAllCustomers(){
        List<Customer> customers = customerRepository.findAll();
        return customers.stream().map(customer ->
                CustomerMapper.mapCustomerToCustomerDTO(customer)).collect(Collectors.toList());
    }
}
