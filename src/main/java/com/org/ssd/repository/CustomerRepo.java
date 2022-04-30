package com.org.ssd.repository;

import com.org.ssd.modal.CustomerClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerClass,Integer> {
}
