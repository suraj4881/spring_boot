package com.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.demo.model.Employer;


public interface EmployerRepo extends MongoRepository<Employer,String> {

	
	List<Employer> findByName(String name);
	Optional<Employer> findById(String id);
	List<Employer> findByAge(Integer age);
	List<Employer> findByNameStartingWith(String regexp);
	List<Employer> findByAgeBetween(Integer ageGT, Integer ageLT);
	//List<Employer> findByNameAndReplace(String name,Employer employer);
	
}
