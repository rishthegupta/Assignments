package com.capgemini.view;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.repo.EmployeeRepoImpl;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeRepo employeeRepo=new EmployeeRepoImpl();
		
		EmployeeServiceImpl employeeService=new EmployeeServiceImpl(employeeRepo);
		
		
		
		System.out.println(employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi")))));
		System.out.println(employeeService.createEmployee(102, "BCD", new Address("D 25",new Country("NEPAL",new City("Kathmandu")))));
		System.out.println(employeeService.createEmployee(103, "CDE", new Address("D 26",new Country("USA",new City("New York")))));
	 System.out.println(employeeService.createEmployee(104, "DEF", new Address("D 27",new Country("CHINA",new City("Bejing")))));
		System.out.println(employeeService.createEmployee(105, "EFG", new Address("D 28",new Country("JAPAN",new City("Tokyo")))));
		
		
		System.out.println(employeeRepo.findByName("ABC"));
		

	}

}
