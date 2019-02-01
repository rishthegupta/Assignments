package com.capgemini.Lab4;

public class Person extends Account {

	

	
	public Person( String name, float age, long accNum, double balance) {
		super(accNum, balance);
		this.name = name;
		this.age = age;
	}


	private String name;
	private float age;

	
	
	


	// GETTER-SETTER...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	public String toString()
	{
		return name+" "+age+" "+" "+getAccNum()+" "+getBalance();
	}
	
	
	
}
