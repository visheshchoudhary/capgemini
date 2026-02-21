package com.bidirectional.Annotation;

import jakarta.persistence.*;

public class Perform {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Book b=new Book();
		b.setName("Adv Java");
		b.setAuthor("Vishesh");
		
		et.begin();
		em.persist(b);
		et.commit();
		
		
	}
}
