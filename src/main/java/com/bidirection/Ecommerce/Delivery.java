package com.bidirection.Ecommerce;

import jakarta.persistence.*;
import java.util.*;
@Entity
public class Delivery {
	@Id
	private int d_id;
	private String type;
	private boolean status;
	@OneToMany
	private List<Orders> order;
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	
	

}
