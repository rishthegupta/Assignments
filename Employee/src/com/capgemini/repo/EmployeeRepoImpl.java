package com.capgemini.repo;

import java.util.Map;
import java.util.HashMap;

import java.util.List;

import com.capgemini.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	
	Map<Integer, Employee> employeeData=new HashMap<>();
	
	
	
	
	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		if(employeeData.containsKey(employee.getEmployeeID()))
		{
			return false;
		}
		employeeData.put(employee.getEmployeeID(),employee);
		
		return true;
	}

	@Override
	public List<Employee> findByName(String name) {
		System.out.println(employeeData.size());
		return null;
	}
	
	
	
	public void printAllEmployee() {
		int n=employeeData.size();
		
		Employee emp;
		System.out.println(n);
		for(int i=0;i<5;i++)
		{
			
			emp=employeeData.get(i);
			System.out.println(emp);
		}
		
	}


}
