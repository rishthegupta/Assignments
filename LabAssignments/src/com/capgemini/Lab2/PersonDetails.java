package com.capgemini.Lab2;
import java.util.Scanner;


public class PersonDetails {

	public static void main(String[] args) {
		String fName,lName;
		char gender;
		int age;
		float weight;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name and Last Name of the Student");
		fName=sc.next();
		lName=sc.next();
		System.out.println("Enter the Gender : M/F");
		gender=sc.next().charAt(0);
		System.out.println("Enter age of the Student");
		age=sc.nextInt();
		System.out.println("Enter weight of the Student");
		weight=sc.nextFloat();
		sc.close();
		
		
		System.out.println("\n\n\n");
		System.out.println("Student Details\n");
		System.out.println("First Name: "+fName);
		System.out.println("Last Name: "+lName);
		System.out.println("Gender:"+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight :"+weight);

	}

}
