package com.capgemini.view;

import java.math.BigDecimal;

import com.capgemini.beans.Customer;
import com.capgemini.repo.WalletRepo;
import com.capgemini.repo.WalletRepoImpl;
import com.capgemini.service.WalletServiceImpl;

public class WalletView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WalletRepo walletRepo=new WalletRepoImpl();
		WalletServiceImpl walletService= new WalletServiceImpl(walletRepo);
		
		Customer c1=walletService.createAccount("ABC", "25622111458", new BigDecimal(500));
		Customer c2=walletService.createAccount("BCD", "1231231234", new BigDecimal(1000));
		Customer c3=walletService.createAccount("DEF", "1203254621", new BigDecimal(5000));
		Customer c4=walletService.createAccount("EFG", "3698547588", new BigDecimal(2000));
		
		
		//System.out.println(c1);
	
		
		System.out.println("Intial Balance of 1231231234 "+walletService.showBalance("1231231234").getWallet().getBalance());

		System.out.println("After Deposit 1000 in 1231231234 "+walletService.depositAmount("1231231234",new BigDecimal(1000)).getWallet().getBalance());
		
		
		System.out.println("After withdrawl 500 from 1231231234 "+walletService.withdrawAmount("1231231234",new BigDecimal(500)).getWallet().getBalance());
		
		
		System.out.println("Intial Balance of 1203254621 "+walletService.showBalance("1203254621").getWallet().getBalance());
		System.out.println("After Fund Transfer balance in 1231231234 "+walletService.fundTransfer("1231231234","1203254621",new BigDecimal(1000)).getWallet().getBalance());
		
		
		
		
		System.out.println("After Fund Transfer in 1203254621 "+walletService.showBalance("1203254621").getWallet().getBalance());
	
	}

}
