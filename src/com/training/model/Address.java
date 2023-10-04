package com.training.model;

public class Address {
	
	private String bldgName;
	private String street;
	private String city;
	private String pincode;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Address(String bldgName, String street, String city, String pincode) {
		super();
		this.bldgName = bldgName;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}



	public String getBldgName() {
		return bldgName;
	}



	public void setBldgName(String bldgName) {
		this.bldgName = bldgName;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "Address [bldgName=" + bldgName + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	

}
