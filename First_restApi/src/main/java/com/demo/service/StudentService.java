package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {

	public Student createStudent(Student student);	
	public List<Student> getAllDetails();
	public Student updateStudent(long id,Student student);
	public String deleteStudent(long id);
	
}
