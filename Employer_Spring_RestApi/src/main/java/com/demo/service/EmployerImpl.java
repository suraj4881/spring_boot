package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Employer;
import com.demo.repo.EmployerRepo;

@Service
public class EmployerImpl implements EmployerService {

	@Autowired
	private EmployerRepo employerrepo;

	@Override
	public Employer createEploye_Dtls(Employer employer) {
		
		return employerrepo.save(employer);
	}

	@Override
	public List<Employer> getAllDetls() {
		
		return employerrepo.findAll();
	}

	@Override
	public Employer updateEmployer(long id, Employer employer) {
		
		    employer.setId(id);
		
		return employerrepo.save(employer);
	}

	@Override
	public String deleteEmployer(long id) {
	Optional<Employer> employer=employerrepo.findById(id);
	  
	       if(employer.get()!=null) {
	    	   employerrepo.delete(employer.get());
	    	   return "Deleted Sucessfully";
	       }
	
		return "employer details not avilable";
	}
	
	
	
	
}
