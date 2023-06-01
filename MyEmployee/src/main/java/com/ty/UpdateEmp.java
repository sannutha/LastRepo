package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmp {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
         Employee emp = entityManager.find(Employee.class,103);
         
         emp.setDesignation("system engineer");
         emp.setSal(45000.0);
         
         entityTransaction.begin();
         entityManager.persist(emp);
         entityTransaction.commit();

	}

}
