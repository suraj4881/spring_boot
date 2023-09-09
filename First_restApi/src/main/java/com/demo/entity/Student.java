package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_dtls")
public class Student{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String city;
	private long rollno;
	private String email;
	
	
	
	
	public Student(long id, String name, String city, long rollno, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.rollno = rollno;
		this.email = email;
	}
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public long getRollno() {
		return rollno;
	}



	public void setRollno(long rollno) {
		this.rollno = rollno;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", rollno=" + rollno + ", email=" + email
				+ "]";
	}




	
	
	
	
	
}
