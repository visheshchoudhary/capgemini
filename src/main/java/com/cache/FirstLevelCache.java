package com.cache;

import jakarta.persistence.*;


public class FirstLevelCache {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em1=emf.createEntityManager();
		EntityTransaction et=em1.getTransaction();
		Studentt s=new Studentt();
		s.setId(1);
		s.setName("Vishesh");
		s.setPhone("951");
		
		Studentt s1=new Studentt();
		s1.setId(2);
		s1.setName("Aryan");
		s1.setPhone("9719051");
		
		et.begin();
		em1.persist(s);
		em1.persist(s1);
		et.commit();
		
		em1.find(Studentt.class, 1);//database
		em1.find(Studentt.class, 1);//cache
		em1.find(Studentt.class, 2);//database
		
		
		EntityManager em2=emf.createEntityManager();
		
		em2.find(Studentt.class, 1); //database
		em2.find(Studentt.class, 1); //cache
		
		
		
		
		
		
		
	}
}
