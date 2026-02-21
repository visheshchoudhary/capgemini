package com.bidirection.oto;

import jakarta.persistence.*;

public class Perform {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person p1=new Person();
		p1.setId(1);
		p1.setName("Vishesh");
		
		Adhar a1=new Adhar();
		a1.setId(101);
		a1.setLoc("India");
		
		p1.setAdhar(a1);
		a1.setPerson(p1);
		
		et.begin();
		em.persist(p1);
		em.persist(a1);
		et.commit();
		
		
		
	}

}
