package com.bidirection.otm;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Crudaccount implements BankAccountCrud{
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void saveBank(Bank bank) {
		et.begin();
		em.persist(bank);
		et.commit();
	}
	public void updateBank(int id) {
		Bank b=em.find(Bank.class,id);
		b.setName("aaaaaa");
		et.begin();
		em.merge(b);
		et.commit();
		
	}
	public Bank findBankById(int id) {
		Bank b=em.find(Bank.class, id);
		return b;
		
	}
	public Bank findBankByName(String name) {
		Bank b=em.find(Bank.class, name);
		return b;
		
	}
	public void assignAccountToBank(int bankid,Account newaccount) {
		Bank b=em.find(Bank.class,bankid);
		List<Account> account=b.getAccount();
		if(account == null) {
			account = new ArrayList<>();
			account.add(newaccount);
			b.setAccount(account);
		}
		else {
			account.add(newaccount);
		}
		//account.add(newaccount);
		//newaccount.setBank(b);
		et.begin();
		em.merge(b);
		et.commit();
		
		
	}
	public void assignAccountsToBank(int bankId,List<Account> accounts) {
		Bank b=em.find(Bank.class,bankId);
		List<Account> account=b.getAccount();
		
		if(account == null) {
			account = new ArrayList<>();
		}

		for(Account a : accounts) {
			account.add(a);
			a.setBank(b);    // imp
		}
		b.setAccount(account);
		et.begin();
		em.merge(b);
		et.commit();
		
	}
	public List<Account> findAllAccountsInBank(int bankId){
		Bank b=em.find(Bank.class,bankId);
		List<Account> account=b.getAccount();
		return account;
		
	}
		
}
