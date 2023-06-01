package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		 Employee e = new Employee();
		 
		 e.setId(101);
		 e.setName("ram");
		 e.setAge(23);
		 e.setSal(45000.0);
		 e.setDesignation("SE");
		 
		 
		 Employee e1 = new Employee();
		 e1.setId(102);
		 e1.setName("anil");
		 e1.setAge(24);
		 e1.setSal(55000);
		 e1.setDesignation("SSE");
		 
		 
		 Employee e2 = new Employee();
		 e2.setId(103);
		 e2.setName("ramya");
		 e2.setAge(22);
		 e2.setSal(25000);
		 e2.setDesignation("intern");
		 
		 Employee e3 = new Employee();
		 e3.setId(104);
		 e3.setName("Neha");
		 e3.setAge(26);
		 e3.setSal(35000.0);
		 e3.setDesignation("ux developer");
		 
		 
		 entityTransaction.begin();
		 entityManager.persist(e);
		 entityManager.persist(e1);
		 entityManager.persist(e2);
		 entityManager.persist(e3);
		 entityTransaction.commit();

	}

}
