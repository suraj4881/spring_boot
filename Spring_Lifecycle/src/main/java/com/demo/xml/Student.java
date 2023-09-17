package com.demo.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	private int id;
	private String name;
	
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@PostConstruct
    public void init() {
    	System.out.println("init created");
    }
	
	@PreDestroy
    public void destroy() {
    	System.out.println("destroy created");
    }
}
