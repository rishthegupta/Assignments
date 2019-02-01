package com.capgemini.Lab3;

import java.util.Scanner;
public class StringOperations {

	private static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int choice;
		String ip;
		
		System.out.println("Enter the String to perform operation on.");
		ip=sc.nextLine();
		
		while(true)
		{
			System.out.println();
			
			System.out.println();
			System.out.println("1: Add String");
			System.out.println("2: Replace odd positions with #");
			System.out.println("3: Remove Duplicate Characters in String");
			System.out.println("4 Change Odd Character to Upper Case");
			System.out.println("5: Exit");
			System.out.println();
			System.out.println("Enter your chioce");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: addString(ip);
					break;
			case 2: replaceWithHash(ip);
					break;
			case 3: removeDuplicateCharacter(ip);
					break;
			case 4: changeOddCharacterToUpperCase(ip);
					break;
			case 5: System.exit(0);
					break;
			default: System.out.println("Wrong Choice !!!");

			}
		}

	}

	// CHANGE TO UPPER CASE
	private static void changeOddCharacterToUpperCase(String ip) {
		char[] ipc =new char[ip.length()];
		for(int i=0;i<ip.length();i++)
		{
			if(i==0 || i%2==0)
				ipc[i]=ip.toUpperCase().charAt(i);
			else 
				ipc[i]=ip.charAt(i);
		}
		ip=String.valueOf(ipc);
		
		System.out.println("New String : "+ip);
		
		
				
	}

	// REMOVE DUPLICATE CHARACTERS
	private static void removeDuplicateCharacter(String ip) {
	
		
		char[] ipc =ip.toCharArray();
		int index=0;
		//
		
		for(int i=0;i<ipc.length;i++)
		{

			int j;
			for( j=0;j<i;j++)
				if(ipc[i]==ipc[j])
					break;		
			
			if(j==i)
				ipc[index++]=ipc[i];
		}
		
		//System.out.println(ipc.length);
		ip="";
		for(int i=0;i<index;i++)
		ip=ip+ipc[i];
		System.out.println("new String : "+ip);
		

	}

	// ERMOVE WITH #
	private static void replaceWithHash(String ip) {
		char[] ipc =new char[ip.length()];
		for(int i=0;i<ip.length();i++)
		{
			if(i==0 || i%2==0)
				ipc[i]='#';
			else 
				ipc[i]=ip.charAt(i);
		}
		ip=String.valueOf(ipc);
		
		System.out.println("New String : "+ip);
	}

	// ADD STRINGS
	private static void addString(String ip) {
			String temp;
			System.out.println("Enter the string to be added");
			temp=sc.next();
			ip=ip+" "+temp;
			System.out.println("New String : "+ ip);
		
	}
	
	

}
