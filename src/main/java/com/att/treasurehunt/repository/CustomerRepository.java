package com.att.treasurehunt.repository;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.*;

import com.att.treasurehunt.entity.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    // Define custom query methods if needed
    @Query("{'service_subscriptions.plan_details.plan_name': ?0}")
    Page<Customer> findByPlanName(String planName, Pageable pageable);

    @Aggregation(pipeline = {
        "{ '$search': { 'text': { 'query': ?0, 'path': { 'wildcard': '*' }, 'fuzzy': {} } } }",
        "{ '$skip': ?1 }",
        "{ '$limit': ?2 }"
    })
    List<Customer> searchCustomers(String query, int skip, int limit);
}

