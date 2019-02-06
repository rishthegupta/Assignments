package com.capgemini.repo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
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
		List<Employee> list=new LinkedList<>();
		
		Iterator<Entry<Integer, Employee>> dataTrav=employeeData.entrySet().iterator();
		while(dataTrav.hasNext())
		{
			Map.Entry<Integer, Employee> data=(Map.Entry<Integer, Employee>)dataTrav.next();
				if(data.getValue().getEmployeeName()==name)
					list.add(data.getValue());
		}			
		return list;
	}
	
	

	@Override
	public Employee searchEmployee(int empID) {
		Iterator<Entry<Integer, Employee>> dataTrav=employeeData.entrySet().iterator();
		while(dataTrav.hasNext())
		{
			Map.Entry<Integer, Employee> data=(Map.Entry<Integer, Employee>)dataTrav.next();
				if(data.getValue().getEmployeeID()==empID)
					return data.getValue();
		}
		return null;			
		
		
	}


}
