package com.capgemini.beans;

public class Country {
	
	private City city;
	private String countryName;
	
	
	
	//Constructor
	public Country( String countryName, City city) {
		super();
		this.city = city;
		this.countryName = countryName;
	}

	

	@Override
	public String toString() {
		return "Country [city=" + city + ", countryName=" + countryName + "]";
	}



	//Getter-Setter Methods
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
