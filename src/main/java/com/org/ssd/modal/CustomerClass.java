package com.org.ssd.modal;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table

public class CustomerClass {
    @Id
    private int customerId;
    private String customerName;
    private String customerAddress;
    private Double customerSalary;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(Double customerSalary) {
        this.customerSalary = customerSalary;
    }
}

