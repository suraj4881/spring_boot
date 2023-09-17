package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	
	 public Student studentSaveAll(Student student);
	 
	 public Student getADetails(String id);
	 
	 public List<Student> getbyRollno(Integer rollno);
	 
	 public List<Student> getStudentCourseDetls(String course);
	 
	 public List<Student> getStudentCourseAndFeeDetls(String course, Double fee);
	 
	 public List<Student> getStudentCourseOrNameDetls(String course, String name);
	 
	 public Integer getStudentCountCourseDetails(String course);
	 
	 public List<Student> getStudentCourseSortByNameDetls(String course);
	 
	 public List<Student> getStudentNameAndCourseByRollnoDetails(Integer rollno);
	 
	 public List<Student> getAllStudentsByCourseDetails(String course);
	 
	 public List<Student> getStudentByCourseRegExByDetls(String course);
}
