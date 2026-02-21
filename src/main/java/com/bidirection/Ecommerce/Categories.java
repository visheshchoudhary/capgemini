package com.bidirection.Ecommerce;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Categories {
	@Id
	private int cat_id;
	private String cat_name;
	private String cat_type;
	
	@OneToMany
	private List<Products> products;

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_type() {
		return cat_type;
	}

	public void setCat_type(String cat_type) {
		this.cat_type = cat_type;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
}
