package com.capgemini.bl;

import java.util.LinkedList;

import com.capgemini.beans.Account;
import com.capgemini.beans.InsufficientBalanceException;
import com.capgemini.beans.InvalidAccountNumberException;

public class ICICIBank {
	
	LinkedList<Account> accounts = new LinkedList<>();
	
	
	
	public String createAccount(int accountNumber, int amount)
	{
		Account account=new Account(accountNumber, amount);
		accounts.add(account);
		
		return "Acccount Created Successfully";
	}
	
	
	private Account searchAccount(int accountNumber)throws InvalidAccountNumberException
	{
		
		for(Account account : accounts)
		{
			if(account.getAccountNumber()==accountNumber)
			{
				return account;
			}
		}
		throw new InvalidAccountNumberException();
		
	}
	
	public int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException
	{
		Account account=searchAccount(accountNumber);
		if((account.getBalance()-amount)>=0)
		{
			account.setBalance(account.getBalance()-amount);
			
			return account.getBalance();
		}
		
		throw new InsufficientBalanceException();
	}
	
	
	public int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException
	{
			Account account=searchAccount(accountNumber);
			account.setBalance(account.getBalance()+amount);
			return account.getBalance();
		
		
	
	}
	
	public String fundTransfer(int accountNumber1, int accountNumber2, int amount) throws InvalidAccountNumberException, InsufficientBalanceException 
	{
			
			depositAmount(accountNumber1, amount);
			withdrawAmount(accountNumber2, amount);
			return "Fund Transfered from "+accountNumber1+ " to "+accountNumber2+" " ;
	}
	
	public int showBalance(int accountNumber) throws InvalidAccountNumberException
	{
		Account account=searchAccount(accountNumber);
		return account.getBalance();
				
		
	}
	
	
	
	
}
