package com.att.treasurehunt.service;

import com.att.treasurehunt.entity.Customer;
import com.att.treasurehunt.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Page<Customer> findCustomersByPlanName(String planName, Pageable pageable) {
        return customerRepository.findByPlanName(planName, pageable);
    }

    private static final int MAX_PAGE_SIZE = 20;

    public Page<Customer> searchCustomers(String query, Pageable pageable) {
        // Ensure the page size does not exceed MAX_PAGE_SIZE
        int pageSize = Math.min(pageable.getPageSize(), MAX_PAGE_SIZE);
        Pageable adjustedPageable = PageRequest.of(pageable.getPageNumber(), pageSize);

        // Calculate skip and limit
        int skip = (int) adjustedPageable.getOffset();
        int limit = adjustedPageable.getPageSize();

        // Fetch the results from the repository
        List<Customer> customers = customerRepository.searchCustomers(query, skip, limit);

        // Use a count query or method to get total count
        long total = customerRepository.count(); 

        // Return a PageImpl with the adjusted page information
        return new PageImpl<>(customers, adjustedPageable, total);
    }

}