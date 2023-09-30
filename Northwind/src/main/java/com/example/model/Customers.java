package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")

public class Customers {
	@Id

	@Column(name="CUSTOMER_ID")

    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

	@Column(name="COMPANY_NAME")

	private String companyName;
	
	
	@Column(name="CONTACT_NAME")

	private String contactName;

	
	@Column(name="CONTACT_TITLE")

    private String contactTitle;

	

	@Column(name="ADDRESS")

    private String address;

	

	@Column(name="CITY")

    private String city;

	

	@Column(name="REGION")

    private String region;

	

	@Column(name="POSTAL_CODE")

    private int postalCode;

	

	@Column(name="COUNTRY")

    private String country;

	

	@Column(name="PHONE")

    private int phone;

	

	@Column(name="FAX")

    private String fax;

    

    public int getCustomerId() {

		return customerId;

	}



	public void setCustomerId(int customerId) {

		this.customerId = customerId;

	}



	public String getCompanyName() {

		return companyName;

	}
	
	public String getContactName() {

		return contactName;

	}
	
	public String getContactTitle() {

		return contactTitle;

	}
	
	public String getAddress() {

		return address;

	}
	
	public String get() {

		return address;

	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public int getPostalCode() {
		return postalCode;
	}



	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getPhone() {
		return phone;
	}



	public void setPhone(int phone) {
		this.phone = phone;
	}



	public String getFax() {
		return fax;
	}



	public void setFax(String fax) {
		this.fax = fax;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public void setContactName(String contactName) {
		this.contactName = contactName;
	}



	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	


	


}
