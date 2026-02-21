package com.bidirection.mtm;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Subject {
		@Id
		private int id;
		private String name;
		private String trainer;
		
		@ManyToMany(mappedBy="subject")
		private List<Student> student;

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

		public String getTrainer() {
			return trainer;
		}

		public void setTrainer(String trainer) {
			this.trainer = trainer;
		}

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}
		
		
}
