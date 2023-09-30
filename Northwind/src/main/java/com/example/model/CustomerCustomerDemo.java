package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_CUSTOMER_DEMO")
public class CustomerCustomerDemo {
    @Id
    
    @Column(name="CUSTOMER_ID")
    private String customerID;
    
    @Column(name="CUSTOMER_TYPE_ID")
    private String customerTypeID;
    
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerTypeID() {
		return customerTypeID;
	}
	public void setCustomerTypeID(String customerTypeID) {
		this.customerTypeID = customerTypeID;
	}

    
}
