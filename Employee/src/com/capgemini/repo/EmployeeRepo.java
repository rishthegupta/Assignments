package com.capgemini.repo;

import java.util.List;

import com.capgemini.beans.Employee;

public interface EmployeeRepo {
	
	boolean saveEmployee(Employee employee);
	List<Employee> findByName(String name);

}
