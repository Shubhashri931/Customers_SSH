package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_DEMOGRAPHICS")
public class CustomerDemographics {
    @Id
    
    @Column(name="CUSTOMER_TYPE_ID")
    private String customerTypeID;
    
    @Column(name="CUSTOMER_DESC")
    private String customerDesc;

	public String getCustomerTypeID() {
		return customerTypeID;
	}

	public void setCustomerTypeID(String customerTypeID) {
		this.customerTypeID = customerTypeID;
	}

	public String getCustomerDesc() {
		return customerDesc;
	}

	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}

    
}