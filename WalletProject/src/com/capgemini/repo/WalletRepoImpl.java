package com.capgemini.repo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.beans.Customer;




public class WalletRepoImpl implements WalletRepo {

	HashMap<String, Customer> userData=new HashMap<String, Customer>();

	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		if(userData.containsKey(customer.getMobileNumber()))
				return false;
		
		userData.put(customer.getMobileNumber(), customer);
		return true;
	}

	@Override
	public Customer findCustomer(String mobileNumber) {
		// TODO Auto-generated method stub
		
		Iterator<Entry<String, Customer>> dataTrav=userData.entrySet().iterator();
		while(dataTrav.hasNext())
		{
			Map.Entry<String, Customer> data=(Map.Entry<String, Customer>)dataTrav.next();
				if(data.getValue().getMobileNumber()==mobileNumber)
					return data.getValue();
		}			
		
		return null;
	}

}
