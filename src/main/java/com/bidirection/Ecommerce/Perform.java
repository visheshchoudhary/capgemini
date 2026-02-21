package com.bidirection.Ecommerce;

import jakarta.persistence.*;
import java.util.*;
public class Perform {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
	}
}
