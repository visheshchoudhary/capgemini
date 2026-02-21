package com.bidirection.oto;

import jakarta.persistence.*;

@Entity
public class Adhar {
	@Id
	private int id;
	private String loc;
	
	@OneToOne(mappedBy="adhar")  // uesd to make the bidirectional if we use JooinColumn
	private Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
