package com.capgemini.beans;

public class Address {
	
	private String address;
	private Country country;
	
	//Constructor
	public Address(String address, Country country) {
		super();
		this.address = address;
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "Address [address=" + address + ", country=" + country + "]";
	}


	//Getter-Setter Methods
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
	
	

}
