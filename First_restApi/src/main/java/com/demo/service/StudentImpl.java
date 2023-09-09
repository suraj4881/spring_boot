package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public Student createStudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public List<Student> getAllDetails() {
		
		return studentrepository.findAll();
	}

	@Override
	public Student updateStudent(long id, Student student) {
		student.setId(id);
		return studentrepository.save(student);
	}

	@Override
	public String deleteStudent(long id) {
		 Optional<Student> student=studentrepository.findById(id);
		 if(student.get()!=null) {
			 studentrepository.delete(student.get());
			 return "Deleted Sucessfully";
		 }
		 
		return "Student is not available";
	}

	
	
	
}
