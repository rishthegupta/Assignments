package com.capgemini.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.beans.Employee;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		Employee emp=new Employee();
		Employee emp1 =new Employee();
		emp.setId(1);
		emp.setName("Rishabh");
		
		emp1.setId(2);
		emp1.setName("Rahul");
		
		entityManager.persist(emp);
		entityManager.persist(emp1);
		System.out.println("Employee inserted successfully");
		Employee etemp= entityManager.find(Employee.class, 1);
		System.out.println(etemp.getName());
		
		entityTransaction.commit();
		
		
		
		
		entityManager.close();
		
	}

}
