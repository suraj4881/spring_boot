package com.demo.service;

import java.util.List;

import com.demo.model.Person;

public interface IpersonService {

	public List<Person> getAllDetls();
	public Person createPerson(Person person);
	public Person updatePerson(String id,Person person);
	public String deletePerson(String id);
	
}
