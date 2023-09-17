package com.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	  @Autowired 
	  private StudentRepo studentrepo;
	  
	  @Override 
	  public Student studentSaveAll(Student student) {
	  
	  return studentrepo.insert(student); }
	  
	  @Override 
	  public Student getADetails(String id) {
	  
	  Optional<Student> opt=studentrepo.getStudentById(id);
	  
	  return opt.get();
	  
	  }

	@Override
	public List<Student> getbyRollno(Integer rollno) {
		
		return studentrepo.getStudentByRollno(rollno);
	}

	@Override
	public List<Student> getStudentCourseDetls(String course) {
		
		return studentrepo.getStudentByCourse(course);
	}

	@Override
	public List<Student> getStudentCourseAndFeeDetls(String course, Double fee) {
		
		return studentrepo.getStudentByCourseAndFee(course, fee);
	}

	@Override
	public List<Student> getStudentCourseOrNameDetls(String course, String name) {
		
		return studentrepo.getStudentByCourseOrName(course, name);
	}

	@Override
	public Integer getStudentCountCourseDetails(String course) {
		
		return studentrepo.getStudentCountByCourse(course);
	}

	@Override
	public List<Student> getStudentCourseSortByNameDetls(String course) {
		
		return studentrepo.getStudentByCourseSortByName(course);
	}

	@Override
	public List<Student> getStudentNameAndCourseByRollnoDetails(Integer rollno) {
		
		return studentrepo.getStudentNameAndCourseByRollno(rollno);
	}

	@Override
	public List<Student> getAllStudentsByCourseDetails(String course) {
		
		return studentrepo.getAllStudentsByCourse(course);
	}

	@Override
	public List<Student> getStudentByCourseRegExByDetls(String course) {
		
		return studentrepo.getStudentByCourseRegEx(course);
	}
	 
	

}
