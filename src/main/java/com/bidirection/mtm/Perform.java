package com.bidirection.mtm;

import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Perform {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Subject s1=new Subject();
//		s1.setId(1);
//		s1.setName("Vishesh");
//		s1.setTrainer("Sandeep");
//		Subject s2=new Subject();
//		s2.setId(2);
//		s2.setName("Aryan");
//		s2.setTrainer("Ravi");
//		
//		
//		Student st1=new Student();
//		st1.setId(101);
//		st1.setName("Java");
//		st1.setPhone("971906");
//		
//		Student st2=new Student();
//		st2.setId(102);
//		st2.setName("Hibernet");
//		st2.setPhone("827977");
//		
//		s1.setStudent(List.of(st1,st2));
//		s2.setStudent(List.of(st1,st2));
//		
//		st1.setSubject(List.of(s1,s2));
//		st2.setSubject(List.of(s1,s2));
		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(st1);
//		em.persist(st2);
//		et.commit();
		
		//fetch
		
		//find
		Student s=em.find(Student.class,101);
		List<Subject> l=s.getSubject();
		
		for(Subject i:l) {
			if(i.getName().equals("Java"))
			i.setTrainer("abxbx");
			
		}
		
		et.begin();
		//em.merge(s);
		for(Subject i:l) {
			em.merge(i);
		}
		
		et.commit();
		
	}
}
