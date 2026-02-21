package com.bidirection.Ecommerce;

import jakarta.persistence.*;
import java.util.*;
@Entity
public class Products {
	@Id
	private int p_id;
	private String p_name;
	//private int cat_id;
	//private int o_id;
	
	@ManyToMany
	private List<Orders> order;
	
	@ManyToOne
	private Categories categories;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	
}
