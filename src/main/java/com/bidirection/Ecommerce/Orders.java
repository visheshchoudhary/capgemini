package com.bidirection.Ecommerce;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Orders {
	@Id
	private int o_id;
	private String date;
	//private int d_id;
	//private int c_id;
	
	@ManyToOne
	private Customer customer;  // this is the forein key
	@ManyToMany
	private List<Products> products;
	@ManyToOne
	private Delivery delivery;
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	

}
