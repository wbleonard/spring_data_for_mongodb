package com.att.treasurehunt.service;

import com.att.treasurehunt.entity.Customer;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Optional<Customer> findById(String id);
    Page<Customer> findCustomersByPlanName(String planName, Pageable pageable);
    Page<Customer> searchCustomers(String query, Pageable pageable);
}
