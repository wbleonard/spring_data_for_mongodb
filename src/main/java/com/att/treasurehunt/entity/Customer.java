package com.att.treasurehunt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    private Address address;

    private Contact contact;

    @Field("customer_since")
    private Date customerSince;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("service_subscriptions")
    private List<ServiceSubscription> serviceSubscriptions;

    @Field("support_tickets")
    private List<SupportTicket> supportTickets;

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Date getCustomerSince() {
        return customerSince;
    }

    public void setCustomerSince(Date customerSince) {
        this.customerSince = customerSince;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ServiceSubscription> getServiceSubscriptions() {
        return serviceSubscriptions;
    }

    public void setServiceSubscriptions(List<ServiceSubscription> serviceSubscriptions) {
        this.serviceSubscriptions = serviceSubscriptions;
    }

    public List<SupportTicket> getSupportTickets() {
        return supportTickets;
    }

    public void setSupportTickets(List<SupportTicket> supportTickets) {
        this.supportTickets = supportTickets;
    }

    
    

    

    
}