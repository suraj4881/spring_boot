package com.demo.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;

@RestController
public class StudentController {

	private List<Student> students = new ArrayList<>();
	
	
    @GetMapping("/student")
	public List<Student> students() {

		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("suraj");
		s1.setLastName("kumar");

		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstName("Ram");
		s2.setLastName("kumar");

		students.add(s1);
		students.add(s2);

		return students;

	}
    
    
    @PostMapping("/student")
    @PreAuthorize("hasRole('ADMIN')")
    public Student createStudent(@RequestBody Student student) {
		
    	students.add(student);
    	
    	return student;
    	
    }
	
}
