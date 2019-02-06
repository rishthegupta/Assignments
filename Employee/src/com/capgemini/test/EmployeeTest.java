package com.capgemini.test;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import org.mockito.Mock;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.beans.Employee;
import com.capgemini.exceptions.DuplicateIdNumberException;
import com.capgemini.exceptions.NameNotFoundException;
import com.capgemini.repo.EmployeeRepo;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeTest {

	
	
	@Mock
	EmployeeRepo employeeRepo;
	EmployeeService employeeService;
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		employeeService=new EmployeeServiceImpl(employeeRepo);
	}
	
	
	/*
	 * CREATE EMPLOYEE Account
	 * 1. Creates account when valid data is passed
	 * 2. When Name is Null 
	 */

	@Test
	public void WhenWeEnterValidDataAccountShouldBeCreated() throws NameNotFoundException
	{
		employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi"))));
	}

	@Test(expected=com.capgemini.exceptions.NameNotFoundException.class)  
	public void WhenWeTryToAddAnAccountWithNUllNameItShouldThroughException() throws NameNotFoundException
	{
		employeeService.createEmployee(0, null,null);
		
	}
	
	/*
	 * Find By Name Method
	 * 1. When we pass the right data the execution goes flawless
	 * 2.n
	 *
	 */
	
	
	@Test()
	public void WhenNameIsPassedItShouldReturnTheList()
	{
		employeeRepo.findByName("ABC");
	}
	
	
	@Test(expected=com.capgemini.exceptions.NameNotFoundException.class)
	public void WhenWeTryToSearchAnIncalidNameItShouldThroughException() throws NameNotFoundException
	{
		employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi"))));
		employeeService.createEmployee(102, "BCD", new Address("D 25",new Country("NEPAL",new City("Kathmandu"))));
		employeeRepo.findByName("asd");
	}

}
