package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/api/")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/create")
	public ResponseEntity<Student> createStudentDetls(@RequestBody Student student){
		
		
		return new ResponseEntity<Student>(studentservice.studentSaveAll(student),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getadetls/{id}")
	public ResponseEntity<Student> getAdetails(@PathVariable(value="id") String id){
		
		
		return new ResponseEntity<Student>(studentservice.getADetails(id),HttpStatus.OK);
		
	}
	
	@GetMapping("/getrollno/{rollno}")
	public ResponseEntity<List<Student>> getrollnodetails(@PathVariable(value="rollno") Integer rollno){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getbyRollno(rollno),HttpStatus.OK);
		
	}
	
	@GetMapping("/getcourse/{course}")
	public ResponseEntity<List<Student>> getcoursedetails(@PathVariable(value="course") String course){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentCourseDetls(course),HttpStatus.OK);
		
	}
	@GetMapping("/getcourseandfee/{course}/{fee}")
	public ResponseEntity<List<Student>> getcourseandfeedetails(@PathVariable(value="course") String course,@PathVariable(value="fee")Double fee){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentCourseAndFeeDetls(course,fee),HttpStatus.OK);
		
	}
	@GetMapping("/getcourseandname/{course}{name}")
	public ResponseEntity<List<Student>> getCourseandNameDetails(@PathVariable(value="course") String course,@PathVariable(value="name")String name){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentCourseOrNameDetls(course,name),HttpStatus.OK);
		
	}
	
	@GetMapping("/getcoursecount/{course}")
	public ResponseEntity<Integer> getcourseCountdetails(@PathVariable(value="course") String course){
		
		
		return new ResponseEntity<Integer>(studentservice.getStudentCountCourseDetails(course),HttpStatus.OK);
		
	}
	
	@GetMapping("/getcoursSortByname/{course}")
	public ResponseEntity<List<Student>> getCoursSortByNameDetails(@PathVariable(value="course") String course){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentCourseSortByNameDetls(course),HttpStatus.OK);
		
	}
	
	@GetMapping("/getStudentNameAndCourseByRollno/{rollno}")
	public ResponseEntity<List<Student>> getNameAndCoursebyRollnoDetails(@PathVariable(value="rollno") Integer rollno){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentNameAndCourseByRollnoDetails(rollno),HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllStudentsByCourseDetails/{course}")
	public ResponseEntity<List<Student>> getAllStudentsBycourseDetls(@PathVariable(value="course") String course){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getAllStudentsByCourseDetails(course),HttpStatus.OK);
		
	}
	
	@GetMapping("/getStudentByCourseRegExByDetls/{course}")
	public ResponseEntity<List<Student>> getStudentbyCourseRegExbyDetails(@PathVariable(value="course") String course){
		
		
		return new ResponseEntity<List<Student>>(studentservice.getStudentByCourseRegExByDetls(course),HttpStatus.OK);
		
	}
	
}
