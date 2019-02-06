package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.DuplicateFormatFlagsException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;
import com.capgemini.exceptions.DuplicateIdNumberException;
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
	 * 1. 
	 */

	@Test
	public void WhenWeEnterValidDataAccountShouldBeCreated() {
		employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi"))));
	}

	@Test(expected=com.capgemini.exceptions.DuplicateIdNumberException.class) 
	public void WhenWeTryToAddAnAccountWithDuplicateIdNumberItShouldThroughException() throws DuplicateIdNumberException
	{
		employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi"))));
		employeeService.createEmployee(101, "ABC", new Address("D 24",new Country("INDIA",new City("Delhi"))));
	}
}
