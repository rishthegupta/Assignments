package com.capgemini.repo;

import com.capgemini.beans.Customer;
import com.capgemini.exception.MobileNumberAlreadyExistsException;
import com.capgemini.exception.PhoneNumberDoesNotExistException;

public interface WalletRepo {
	
	public boolean save(Customer customer) throws MobileNumberAlreadyExistsException;
	public Customer findCustomer(String mobileNumber) throws PhoneNumberDoesNotExistException;

}
