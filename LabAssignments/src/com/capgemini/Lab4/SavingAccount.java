package com.capgemini.Lab4;

public class SavingAccount extends Account {

	public SavingAccount(long accNum, double balance) {
		super(accNum, balance);
		// TODO Auto-generated constructor stub
	}
	
	private int minBalance=500;
	
	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public void withdraw(double amount)
	{
		if(getBalance()>minBalance)
		{
			setBalance(getBalance()-amount);
		}
	}
	
}



