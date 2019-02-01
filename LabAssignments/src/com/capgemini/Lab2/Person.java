package com.capgemini.Lab2;

public class Person {
	private String fName;
	private String lname;
	private char gender;
	private String phoneNumber;

	public Person() {
		super();
		this.fName = fName;
		this.lname = lname;
		this.gender = gender;
	}
	
	public Person(String fName, String lname, char gender) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.gender = gender;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return lname;
	}
	public void setLName(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}
