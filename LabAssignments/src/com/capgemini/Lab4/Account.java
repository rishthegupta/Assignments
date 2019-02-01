package com.capgemini.Lab4;

public class Account {

	private long accNum;
	private double balance=500;
	private Person accHolder;
	
	//CONSTRUCTOR
	
	public Account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	
	}
	
	
	// GETTER SETTER

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
	
	
	
	//METHODS
	
	public void deposit(double amount) {
		balance=balance+amount;
		//System.out.println("Balance updated : "+balance);
		
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
		//System.out.println("Balance updated : "+balance);
	}
	

	

}
