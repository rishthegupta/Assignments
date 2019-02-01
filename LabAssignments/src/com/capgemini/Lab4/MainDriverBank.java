package com.capgemini.Lab4;


public class MainDriverBank {

	
	public static void main(String[] args) {
		
		Person smith=new Person("Smith", 30, 1001,2000.00);
		Person kathy=new Person("kathy", 40, 1002,3000.00);
		
		
		System.out.println("Smith's Initial Balance : "+smith.getBalance());
		System.out.println("Kathy's Intial Balance :"+kathy.getBalance());
		System.out.println();
		
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println();
		
		System.out.println("Smith's Balance :"+smith.getBalance());
		System.out.println("Kathy's Balance :"+kathy.getBalance());
		System.out.println();
		System.out.println("Name  Age  AccNo  Balance");
		
		System.out.println(smith.toString());
		System.out.println(kathy.toString());
		
	}	

}
