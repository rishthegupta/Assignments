package com.capgemini.view;
import java.util.Scanner;

import com.capgemini.bl.StudentSchedular;
import com.capgemini.beans.Courses;


public class View {

	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch = new StudentSchedular();
	
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int choice;
		
		while(true)
		{
			System.out.println();
			System.out.println("1.add student");
			System.out.println("2.show all students");
			System.out.println("3.show student by roll number");
			System.out.println("4.exit");
			System.out.println();
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
				case 1:addStudentDetails();
					break;   
				case 2:showAllStudents();
					break;
				case 3:showStuByRollNumber();
					break;
				case 4: System.exit(0);
			 		break;
			 default:System.out.println("Sorry entered wrong choice");			   
			}
			
		}
		
	}
	
	

	private static void showStuByRollNumber() {
		System.out.println("Enter roll number of Student");
		int rollNumber=sc.nextInt();
		String op= studSch.showStudentsByRollNumber(rollNumber);
		System.out.println(op);
		
		
		
	}

	

	private static void showAllStudents() {
		
		String op= studSch.showAllStudents();
		
		
		System.out.println(op);
		
	}

	private static void addStudentDetails() {
		String courseTemp;
		boolean f;
		System.out.println("Enter roll number");
		int rollNumber=sc.nextInt();
		f=studSch.checkRollNumber(rollNumber);
		while(!f)
		{
			System.out.println("This Student Exists !!! Enter different Roll Number");
			rollNumber=sc.nextInt();
			f=studSch.checkRollNumber(rollNumber);
		}
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter the number of courses");
		
		int numOfCourses = sc.nextInt();
		Courses[] courses = new Courses[numOfCourses];
		
		System.out.println("enter "+ numOfCourses +" number of courses");
		for(int i=0;i<numOfCourses;i++)
		{
			courseTemp=sc.next();
			courses[i]=new Courses(i+1,courseTemp);
		}
		
		
		
		System.out.println(studSch.addStudent(rollNumber, name, courses));
		
		
	}

}