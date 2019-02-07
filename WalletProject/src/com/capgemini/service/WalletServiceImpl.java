package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Wallet;
import com.capgemini.repo.WalletRepo;


public class WalletServiceImpl implements WalletService {
	
	
	WalletRepo walletrepo;
	
	//Constructor
	public WalletServiceImpl(WalletRepo walletrepo) {
		super();
		this.walletrepo = walletrepo;
	}

	

	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		
		Wallet wallet=new Wallet();
		wallet.setBalance(amount);
		Customer customer =new Customer();
		
		customer.setName(name);
		customer.setMobileNumber(mobileNumber);
		customer.setWallet(wallet);
		
		if(walletrepo.save(customer))
			return customer;
		
		return null;
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		// TODO Auto-generated method stub
		Customer customer=walletrepo.findCustomer(mobileNumber);
		return customer;
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=walletrepo.findCustomer(mobileNumber);
		
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
		
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=walletrepo.findCustomer(mobileNumber);
		
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount));
		
		return customer;
	}
	

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer1=walletrepo.findCustomer(sourceMobileNumber);
		Customer customer2=walletrepo.findCustomer(targetMobileNumber);
		
		customer1.getWallet().setBalance(customer1.getWallet().getBalance().subtract(amount));
		customer2.getWallet().setBalance(customer2.getWallet().getBalance().add(amount));
		
		return customer1;
	}

}
