package com.demo.service;

import java.util.List;
import com.demo.model.Employer;

public interface EmployerService {

	public Employer createEmployerdetls(Employer employer);
	
	public List<Employer> getByNameDetails(String name);
	
	public Employer getByIdDetails(String id);
	
	public List<Employer> getByAgeDetails(Integer age);
	
	public List<Employer> getByNameStartingWithDetails(String regexp);
	
	public List<Employer> getByAgeBetweenDetails(Integer ageGT, Integer ageLT);
	
	//public List<Employer> getByNameAndReplaceDetails(String name,Employer employer);
	
}
