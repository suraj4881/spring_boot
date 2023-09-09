package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employer;

import com.demo.service.EmployerService;


@RestController
@RequestMapping("/api/")
public class Controller {

	@Autowired
	private EmployerService employerService;
	
	@PostMapping("/create")
	public ResponseEntity<Employer> createEmployer(@RequestBody Employer employer){
		return new ResponseEntity<Employer>(employerService.createEploye_Dtls(employer),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getdetls")
	public ResponseEntity<List<Employer>> getAllDetls(){
		return new ResponseEntity<List<Employer>>(employerService.getAllDetls(),HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employer> updateEmployer(@PathVariable(value="id")  long id,@RequestBody Employer employer){
		return new ResponseEntity<Employer>(employerService.updateEmployer(id, employer),HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployer(@PathVariable(value="id")  long id){
		return new ResponseEntity<String>(employerService.deleteEmployer(id),HttpStatus.OK);
		
	}
}
