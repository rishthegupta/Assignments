package com.capgemini.service;

import java.math.BigDecimal;
import java.util.List;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Transactions;

public interface WalletService {
	
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount);
	public Customer showBalance(String mobileNumber);
	public Customer depositAmount(String mobileNumber , BigDecimal amount);
	public Customer withdrawAmount(String mobileNumber , BigDecimal amount);
	public Customer fundTransfer(String sourceMobileNumber ,String targetMobileNumber, BigDecimal amount);
	public List<Transactions> showTransactions(String mobileNumber);
}
