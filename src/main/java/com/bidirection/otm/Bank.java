package com.bidirection.otm;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Bank {
		@Id
		private int id;
		private String name;
		private String location;
		@OneToMany(mappedBy="bank",cascade=CascadeType.ALL)
		private List<Account> account;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public List<Account> getAccount() {
			return account;
		}
		public void setAccount(List<Account> account) {
			this.account = account;
		}
		
		
}
