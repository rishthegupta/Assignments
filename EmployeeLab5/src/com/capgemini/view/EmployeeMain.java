package com.capgemini.view;

import java.util.LinkedList;
import java.util.Scanner;

import com.capgemini.bean.Employee;
import com.capgemini.service.InsuranceGenerator;

public class EmployeeMain {

	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> empList=new LinkedList<>();
		Employee emp;
		int empID;
		String name;
		int salary;
		
		
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		System.out.println("ENTER DETAILS OF "+n+" Employees");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name of the employee");
			name=sc.next();
			System.out.println("What's Employee ID of "+name);
			empID=sc.nextInt();
			System.out.println("How much "+name +" earns");
			salary=sc.nextInt();
			
			emp=new Employee(empID, name, salary);
			
			String[] temp=new InsuranceGenerator(emp).insuranceSchemeGenerator(emp).split("::");
			emp.setDesignation(temp[0]);
			emp.setInsuranceScheme(temp[1]);
			
			empList.add(emp);
			
			System.out.println( name+" Registered");
		}
		
		
		System.out.println(empList);
	}

}
