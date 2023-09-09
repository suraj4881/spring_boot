package com.demo.service;

import java.util.List;

import com.demo.entity.Employer;

public interface EmployerService {

	public Employer createEploye_Dtls(Employer employer);
	public List<Employer> getAllDetls();
	public Employer updateEmployer(long id,Employer employer);
	public String deleteEmployer(long id);
	
}
