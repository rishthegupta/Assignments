package com.capgemini.beans;

public class City {
	
	
	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	}

	private String cityName;
	
	//Constructor
	public City(String cityName) {
		super();
		this.cityName = cityName;
	}
	
	
	//Getter-Setter Methods

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

}
