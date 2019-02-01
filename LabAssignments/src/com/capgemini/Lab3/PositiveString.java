package com.capgemini.Lab3;

import java.util.Scanner;

public class PositiveString {
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String ip;
		System.out.println("Enter the String to be checked");
		ip=sc.next();
		check(ip);
		

	}

	private static void check(String ip) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=0;i<ip.length();i++)
		{
			if(i!=ip.length()-1)
			if((int)ip.charAt(i)<(int)ip.charAt(i+1))
				f++;
			else
				System.out.println("Negative String");
		
		}
		
		if(f==ip.length())
			System.out.println("Positive String");
	}

}
