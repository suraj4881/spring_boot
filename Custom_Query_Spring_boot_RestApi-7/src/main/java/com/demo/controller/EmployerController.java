package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employer;
import com.demo.service.EmployerService;

@RestController
@RequestMapping("/api/")
public class EmployerController {

	@Autowired
	private EmployerService employerservice;
	
	@PostMapping("/create")
	public ResponseEntity<Employer> createEmployer(@RequestBody Employer employer){
		
		return new ResponseEntity<Employer>(employerservice.createEmployerdetls(employer),HttpStatus.CREATED) ;
		
		
	}
	
	   @GetMapping("/getByNameDetls/{name}")
       public ResponseEntity<List<Employer>> getByNameDetls(@PathVariable(value="name") String name){
		
		return new ResponseEntity<List<Employer>>(employerservice.getByNameDetails(name),HttpStatus.OK) ;
		
		
	}
	   
	   
	   @GetMapping("/getByIdDetls/{id}")
       public ResponseEntity<Employer> getByIdDetls(@PathVariable(value="id") String id){
		
		return new ResponseEntity<Employer>(employerservice.getByIdDetails(id),HttpStatus.OK) ;
		
		
	}
	   
	   @GetMapping("/getByAgeDetls/{age}")
       public ResponseEntity<List<Employer>> getByAgeDetls(@PathVariable(value="age") Integer age){
		
		return new ResponseEntity<List<Employer>>(employerservice.getByAgeDetails(age),HttpStatus.OK) ;
		
		
	}
	   
	   @GetMapping("/getByNameStartingWithDetls/{regexp}")
       public ResponseEntity<List<Employer>> getByNameStartingWithDetls(@PathVariable(value="regexp") String regexp){
		
		return new ResponseEntity<List<Employer>>(employerservice.getByNameStartingWithDetails(regexp),HttpStatus.OK) ;
		
		
	}
	   
	   @GetMapping("/getByAgeBetweenDetls/{ageGT},{ageLT}")
       public ResponseEntity<List<Employer>> getByAgeBetweenDetls(@PathVariable(value="ageGT") Integer ageGT,@PathVariable(value="ageLT")Integer ageLT){
		
		return new ResponseEntity<List<Employer>>(employerservice.getByAgeBetweenDetails(ageGT, ageLT),HttpStatus.OK) ;
		
		
	}
	   
	   
	/*
	 * @PutMapping("/getByNameAndReplaceDetls/{name}") public
	 * ResponseEntity<List<Employer>>
	 * getByNameAndReplaceDetls(@PathVariable(value="name") String name,@RequestBody
	 * Employer employer){
	 * 
	 * return new
	 * ResponseEntity<List<Employer>>(employerservice.getByNameAndReplaceDetails(
	 * name, employer),HttpStatus.OK) ;
	 * 
	 * 
	 * }
	 */
}
