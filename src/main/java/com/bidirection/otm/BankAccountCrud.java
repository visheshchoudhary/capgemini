package com.bidirection.otm;
import java.util.*;
public interface BankAccountCrud {
		void saveBank(Bank bank);
		void updateBank(int id);
		Bank findBankById(int id);
		Bank findBankByName(String name);
		void assignAccountToBank(int bankid,Account newaccount);
		void assignAccountsToBank(int bankId,List<Account> accounts);
		List<Account> findAllAccountsInBank(int bankId);
		
}
