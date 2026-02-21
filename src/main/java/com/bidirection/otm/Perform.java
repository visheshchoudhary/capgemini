package com.bidirection.otm;
import java.util.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Perform {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		
		Crudaccount crud = new Crudaccount();

		// ===============================
		// 1️ Save Bank
		// ===============================
		Bank bank = new Bank();
		bank.setId(1);
		bank.setName("SBI");
		bank.setLocation("Punjab");

		crud.saveBank(bank);
		System.out.println("Bank Saved");


		// ===============================
		// 2️ Assign Single Account
		// ===============================
		Account a1 = new Account();
		a1.setId(101);
		a1.setName("Savings");
		a1.setBalance(5000);

		crud.assignAccountToBank(1, a1);
		System.out.println("Single Account Added");


		// ===============================
		// 3️ Assign Multiple Accounts
		// ===============================
		Account a2 = new Account();
		a2.setId(102);
		a2.setName("Current");
		a2.setBalance(15000);

		Account a3 = new Account();
		a3.setId(103);
		a3.setName("Salary");
		a3.setBalance(25000);

		List<Account> list = new ArrayList<>();
		list.add(a2);
		list.add(a3);

		crud.assignAccountsToBank(1, list);
		System.out.println("Multiple Accounts Added");


		// ===============================
		// 4️ Find Bank
		// ===============================
		Bank found = crud.findBankById(1);
		System.out.println("Bank Details:");
		System.out.println(found.getId());
		System.out.println(found.getName());
		System.out.println(found.getLocation());


		// ===============================
		// 5️ Update Bank
		// ===============================
		found.setName("ICICI");
		found.setLocation("Delhi");

		crud.updateBank(1);
		System.out.println("Bank Updated");


		// ===============================
		// 6️ Display All Accounts
		// ===============================
		List<Account> accounts =
				crud.findAllAccountsInBank(1);

		System.out.println("Accounts in Bank:");

		for(Account acc : accounts) {
			System.out.println(
				acc.getId() + " | " +
				acc.getName() + " | " +
				acc.getBalance()
			);
		}
		
	}
}
