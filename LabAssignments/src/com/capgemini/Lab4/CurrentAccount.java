package com.capgemini.Lab4;

public class CurrentAccount extends Account {
	
	public CurrentAccount(long accNum, double balance) {
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

	
	int overdraftLimit=4000;
	@Override
	public void withdraw(double amount)
	{
		if(getBalance()>overdraftLimit)
		{
			System.out.println("Limit OverDrafted");
		}
		else
			System.out.println("You can withdraw");
	}

}
