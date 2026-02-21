package com.bidirection.Ecommerce;

import jakarta.persistence.*;
import java.util.*;
@Entity
public class Customer {
		@Id
		private int c_id;
		private String name;
		private String email;
		private String address;
		
		@OneToMany
		List<Orders> order;

			
		Customer(){}
		
		Customer(int a,String b,String c,String d){
			c_id=a;
			name=b;
			email=c;
			address=d;
			
		}
		public int getC_id() {
			return c_id;
		}

		public void setC_id(int c_id) {
			this.c_id = c_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public List<Orders> getOrder() {
			return order;
		}

		public void setOrder(List<Orders> order) {
			this.order = order;
		}
		
		
		
		
}
