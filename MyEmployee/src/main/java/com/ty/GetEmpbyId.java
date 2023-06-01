package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetEmpbyId {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
//		 EntityTransaction entityTransaction = entityManager.getTransaction(); need not to write this line while fetching data 
         Employee emp = entityManager.find(Employee.class,103);
         
         System.out.println("The employee id is "+emp.getId());
         System.out.println("The employee name is "+emp.getName());
         System.out.println("The employee designation is "+emp.getDesignation());
         
         
//         entityTransaction.begin();
//         entityManager.persist(emp);
//         entityTransaction.commit();

	}

}
