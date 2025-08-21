package com.app.hotelmanager.repository;

import com.app.hotelmanager.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
