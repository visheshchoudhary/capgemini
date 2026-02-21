package com.bidirectional.Annotation;

import java.time.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Table(name="Book_table")
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // it will give id automatically
	private int id;
	
	// Will not be inserted during persist
	@Column(name="book_name",insertable = false,nullable=false, length=100)
	private String name;
	@Column(updatable = false)
	private String author;
	@CreationTimestamp  // it give give time automatically
	private LocalDateTime created_DateTime;
	
	@UpdateTimestamp
	private LocalDateTime updated_DateTime;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	

	
}
