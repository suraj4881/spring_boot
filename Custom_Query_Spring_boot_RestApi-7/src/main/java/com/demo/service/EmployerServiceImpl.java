package com.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employer;
import com.demo.repo.EmployerRepo;

@Service
public class EmployerServiceImpl implements EmployerService {

	@Autowired
	private EmployerRepo employerrepo;

	@Override
	public Employer createEmployerdetls(Employer employer) {
		
		return employerrepo.insert(employer);
	}

	@Override
	public List<Employer> getByNameDetails(String name) {
		
		return employerrepo.findByName(name);
	}

	@Override
	public Employer getByIdDetails(String id) {
		
		Optional<Employer> opt=employerrepo.findById(id);
		
		return opt.get() ;
	}

	@Override
	public List<Employer> getByAgeDetails(Integer age) {
		
		return employerrepo.findByAge(age);
	}

	@Override
	public List<Employer> getByNameStartingWithDetails(String regexp) {
		
		return employerrepo.findByNameStartingWith(regexp);
	}

	@Override
	public List<Employer> getByAgeBetweenDetails(Integer ageGT, Integer ageLT) {
		
		return employerrepo.findByAgeBetween(ageGT, ageLT);
	}

	/*
	 * @Override public List<Employer> getByNameAndReplaceDetails(String name,
	 * Employer employer) {
	 * 
	 * return employerrepo.findByNameAndReplace(name, employer); }
	 */
	
	
	
}
