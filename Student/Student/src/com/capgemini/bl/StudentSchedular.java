package com.capgemini.bl;

import com.capgemini.beans.Courses;
import com.capgemini.beans.Student;




public class StudentSchedular {
	
	private Student[] students = new Student[10];
	private Courses[] cTemp;
	
	private int counterStudent;
	
	
	public String addStudent(int rollNumber,String name,Courses[] courses)
	{
		
		students[counterStudent++]=new Student(rollNumber,name,courses);
		return "Student added successfully";
		
	}
	
	
	public String showAllStudents()
	{
		String op=null;;
		
		for(int i=0;i<counterStudent;i++)
		{
			op=students[i].getName()+" " +" "+students[i].getRollNumber()+"\n";
			op=op+"Courses Enrolled \n";
			cTemp=students[i].getCourses();
			for(int j=0;j<cTemp.length;j++) 
			{
				op+=cTemp[j].getCourseName()+"\n";
			}
		}
		op=op+"\n";
		return op;
		
	}
	
	



	public String showStudentsByRollNumber(int rollNumber) {
		
		
		String op=null;
		for(int i=0;i<counterStudent;i++)
		{
			if(students[i].getRollNumber()==rollNumber)
			{
					op=students[i].getName()+" " +" "+students[i].getRollNumber()+"\n";
					op=op + "Courses Enrolled \n";
					cTemp=students[i].getCourses();
					for(int j=0;j<cTemp.length;j++) 
					{
						op+=cTemp[j].getCourseName()+"\n";
					}
				
			}
			else System.out.println("Student not exixt !!!");
		}
		return op;
	}

	public boolean checkRollNumber(int rollNumber) {
		int c=1;
		for(int i=0;i<counterStudent;i++)
		{
			if(students[i].getRollNumber()==rollNumber)
			{
				c=0;
				return false;
			}
			else 
				c=1;
		}
		if(c==1)
			return true;
		
		return true;
		
		
	}
}