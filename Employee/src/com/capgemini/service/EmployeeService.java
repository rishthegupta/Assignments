package com.capgemini.service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.NameNotFoundException;


public interface EmployeeService {

	
	Employee createEmployee(int employeeID, String name, Address address) throws NameNotFoundException;
	List<Employee> searchByName(String name);
	

}
