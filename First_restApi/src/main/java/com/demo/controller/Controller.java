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

import com.demo.entity.Student;
import com.demo.service.StudentService;


@RestController
@RequestMapping("/api/")
public class Controller {
    
	
	@Autowired
	private StudentService studentservice;
	
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		
		
		return new ResponseEntity<Student>(studentservice.createStudent(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllDetails")
	public ResponseEntity<List<Student>> getAllDetails(){
		   return new ResponseEntity<List<Student>>(studentservice.getAllDetails(),HttpStatus.OK);
	}
	
	@PutMapping("/editStudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value="id")  long id,@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentservice.updateStudent(id, student),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable(value="id")  long id){
		
		return new ResponseEntity<String>(studentservice.deleteStudent(id),HttpStatus.OK);
		
	}
}
