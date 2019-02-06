package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdNumberException;
import com.capgemini.repo.EmployeeRepo;


public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepo employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	
	
	

	@Override
	public Employee createEmployee(int employeeID,String employeeName, Address address)  {
		Employee employee= new Employee();
		
//		if(employeeRepo.searchEmployee(employeeID).getEmployeeID()==employeeID)
//		{
//			throw new DuplicateIdNumberException();
//		}
		employee.setEmployeeID(employeeID);
		employee.setEmployeeName(employeeName);
		employee.setAddress(address);
		
		
		if(employeeRepo.saveEmployee(employee))
			return employee;
		else 
			return null;
		
	}

	@Override
	public List<Employee> searchByName(String name) {
		
		return employeeRepo.findByName(name);
	}

	
	
}
