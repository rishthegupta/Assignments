package com.capgemini.service;

import java.math.BigDecimal;

import java.util.List;

import com.capgemini.beans.Customer;
import com.capgemini.beans.Transactions;
import com.capgemini.beans.Wallet;
import com.capgemini.repo.WalletRepo;




public class WalletServiceImpl implements WalletService {
	
	static int transactionID=1;
	WalletRepo walletrepo;
	
	// Constructor
	public WalletServiceImpl(WalletRepo walletrepo) {
		super();
		this.walletrepo = walletrepo;
	}

	
	// OVERRIDDEN METHODS
	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) {
		
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
		
		Customer customer=walletrepo.findCustomer(mobileNumber);
		Transactions transaction= new Transactions();
		
		transaction.setAmount(customer.getWallet().getBalance());
		transaction.setMobileNumber(customer.getMobileNumber());
		transaction.setTransactionId(transactionID++);
		transaction.setTransactionType("Show balance");
		customer.getL().add(transaction);
		return customer;
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) {
		
		Customer customer=walletrepo.findCustomer(mobileNumber);
		if(customer==null)
		{
			System.out.println(customer);
			throw new NullPointerException();
		}
		customer.getWallet().setBalance(customer.getWallet().getBalance().add(amount));
		
		//Update transaction
		Transactions transaction= new Transactions();
		transaction.setAmount(customer.getWallet().getBalance());
		transaction.setMobileNumber(customer.getMobileNumber());
		transaction.setTransactionId(transactionID++);
		transaction.setTransactionType("Deposit");
		customer.getL().add(transaction);
		
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer=walletrepo.findCustomer(mobileNumber);
		
		customer.getWallet().setBalance(customer.getWallet().getBalance().subtract(amount));
		
		//Update transaction
		Transactions transaction= new Transactions();
		transaction.setAmount(customer.getWallet().getBalance());
		transaction.setMobileNumber(customer.getMobileNumber());
		transaction.setTransactionId(transactionID++);
		transaction.setTransactionType("Withdraw");
		customer.getL().add(transaction);
		
		return customer;
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer1=walletrepo.findCustomer(sourceMobileNumber);
		Customer customer2=walletrepo.findCustomer(targetMobileNumber);
		
		customer1.getWallet().setBalance(customer1.getWallet().getBalance().subtract(amount));
		customer2.getWallet().setBalance(customer2.getWallet().getBalance().add(amount));
		
		//Update transaction
		//Remitter's account
		customer1.getTransaction().setAmount(customer1.getWallet().getBalance());
		customer1.getTransaction().setMobileNumber(customer1.getMobileNumber());
		customer1.getTransaction().setTransactionId(transactionID++);
		customer1.getTransaction().setTransactionType("Fund transfered");
		customer1.getL().add(customer1.getTransaction());
		
		//Reciever's account
		customer2.getTransaction().setAmount(customer2.getWallet().getBalance());
		customer2.getTransaction().setMobileNumber(customer2.getMobileNumber());
		customer2.getTransaction().setTransactionId(transactionID++);
		customer2.getTransaction().setTransactionType("Fund Recieved");
		customer2.getL().add(customer2.getTransaction());
		
		
		return customer1;
	}

	@Override
	public List<Transactions> showTransactions(String mobileNumber) {
		
		return walletrepo.findCustomer(mobileNumber).getL();
	}
	
	

}
