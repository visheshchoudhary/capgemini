package com.bidirection.mtm;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String phone;
	
	@ManyToMany
	private List<Subject> subject;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	

}
