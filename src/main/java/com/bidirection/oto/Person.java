package com.bidirection.oto;

import jakarta.persistence.*;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	@JoinColumn  // used to keep the extra column in the table and delete from Adhar
	@OneToOne
	private Adhar adhar;
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
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	
}
