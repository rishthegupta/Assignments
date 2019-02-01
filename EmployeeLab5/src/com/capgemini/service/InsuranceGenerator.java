package com.capgemini.service;

import com.capgemini.bean.Employee;

public class InsuranceGenerator implements EmployeeService{

	Employee emp;
	
	
	
	
	
	public InsuranceGenerator(Employee emp) {
		super();
		this.emp = emp;
	}





	@Override
	public String insuranceSchemeGenerator(Employee emp) {
		
		String insuranceScheme=null;
		String designation=null;
		if(emp.getSalary()>5000 && emp.getSalary()<2000 )
		{
			designation="System Associate";
			insuranceScheme="Scheme C";
			
		}
		else if(emp.getSalary()>=20000 && emp.getSalary()<40000 )
		{
			designation="Programer";
			insuranceScheme="Scheme B";
			
		}
		else if(emp.getSalary()>=40000  )
		{
			designation="manager";
			insuranceScheme="Scheme A";
			
		}
		
		else if(emp.getSalary()<5000)
		{
			designation="Clerk";
			insuranceScheme="No Scheme ";
			
		}
		return  designation+"::"+insuranceScheme;
	}

	
	
	
}
