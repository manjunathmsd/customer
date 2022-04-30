package com.org.ssd.service;

import com.org.ssd.modal.CustomerClass;

import java.util.Optional;

public interface CustomerService {
    public void createCustomerRecords(CustomerClass customerClass);
    public Optional<CustomerClass> getByCustomerId(Integer customerId );
}
