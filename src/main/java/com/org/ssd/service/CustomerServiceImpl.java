package com.org.ssd.service;

import com.org.ssd.modal.CustomerClass;
import com.org.ssd.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo customerRepo;
    @Override
    public void createCustomerRecords(CustomerClass customerClass)
    {
        customerRepo.save(customerClass);
    }

    @Override
    public Optional<CustomerClass> getByCustomerId(Integer customerId) {
        Optional<CustomerClass> sss= customerRepo.findById(customerId);
        return sss;
    }
}
