package com.capgemini.Lab2;
import java.util.Scanner;

public class PersonMain {
	
	
	
	
	
	static void show(Person p)
	{
		System.out.println("First Name :"+p.getfName());
		System.out.println("Last Name :"+p.getLName());
		System.out.println("Gender :"+p.getGender());
		System.out.println("Phone NUmber :"+p.getPhoneNumber());
		
	}

	public static void main(String[] args) {
		Person p=new Person();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student name");
		String fName=sc.next();
		
		
		System.out.println("Enter alast Name");
		String lName=sc.next();
		
		
		System.out.println("Enter Gender");
		char gender=sc.next().charAt(0);
		while(!(gender=='M'||gender=='F'|| gender=='m'||gender=='f'))
		{
			System.out.println("Please enter corerect gender");
			gender=sc.next().charAt(0);
		}
		
		System.out.println("Enter Phone Number");
		String phoneNumber=sc.next();
		
		p.setfName(fName);
		p.setLName(lName);
		p.setGender(gender);
		p.setPhoneNumber(phoneNumber);
		
		show(p);
		sc.close();
	}

}
