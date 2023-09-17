package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.exception.PersonNotFoundException;
import com.demo.model.Person;
import com.demo.repo.Iperson;


@Service
public class PersonServiceImpl implements IpersonService {

	
	@Autowired
	private Iperson ipersonrepo;
	
	@Override
	public List<Person> getAllDetls() {
		
		return ipersonrepo.findAll();
	}

	@Override
	public Person createPerson(Person person) {
		
		return ipersonrepo.save(person);
	}

	@Override
	public Person updatePerson(String id,Person person) {
		
		person.setId(id);
		return ipersonrepo.save(person);
	}

	@Override
	public String deletePerson(String id) {
		Optional<Person> pr=ipersonrepo.findById(id);
		
	   if(pr.isEmpty()) 
			
			throw new PersonNotFoundException("Request person id is not exit");
		
		
		else if(pr.get()!=null) {
			
			return "ipersonrepo.delete(pr.get())";
		}
	   
	   return "sucessfully deleted";
	}

}
