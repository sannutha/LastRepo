package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmp {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
         Employee emp = entityManager.find(Employee.class,0);
         
         if(emp!=null) {
         
         entityTransaction.begin();
         entityManager.remove(emp);
         entityTransaction.commit();
         }
         
         else {
        	 System.out.println("data already deleted");
         }
	}

}
