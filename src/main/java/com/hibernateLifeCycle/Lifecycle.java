package com.hibernateLifeCycle;


import jakarta.persistence.*;

public class Lifecycle {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Temp t=new Temp();
		t.setId(1);
		t.setName("Vishesh");
		et.begin();
		em.persist(t);
		
		
		
	}
}
