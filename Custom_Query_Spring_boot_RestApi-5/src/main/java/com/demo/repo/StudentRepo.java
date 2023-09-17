package com.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.demo.model.Student;


public interface StudentRepo extends MongoRepository<Student,String> {

	 @Query("{id :?0}")                                                  //SQL Equivalent : SELECT * FROM BOOK WHERE ID=?
     Optional<Student> getStudentById(String id);

	 
	 
     //@Query("{rollno : {$lt: ?0}}")                                 // SQL Equivalent : SELECT * FROM STUDENT where rollno<?
     //@Query("{ rollno : { $gte: ?0 } }")                        // SQL Equivalent : SELECT * FROM STUDENT where rollno>=?
     @Query("{ rollno : ?0 }")                                      // SQL Equivalent : SELECT * STUDENT STUDENT where rollno=?
     List<Student> getStudentByRollno(Integer rollno);

     
     @Query("{course : ?0}")                                         // SQL Equivalent : SELECT * FROM STUDENT where course = ?
     List<Student> getStudentByCourse(String course);

    
   
      @Query("{course: ?0, fee: ?1}")                            // SQL Equivalent : SELECT * FROM STUDENT where course = ? and fee=?
      //@Query("{$and :[{course: ?0},{fee: ?1}] }")
      List<Student> getStudentByCourseAndFee(String course, Double fee);

    
      @Query("{$or :[{course: ?0},{name: ?1}]}")            //SQL Equivalent : select count(*) from STUDENT where course=? or name=?
      List<Student> getStudentByCourseOrName(String course, String name);

  
      @Query(value ="{course: ?0}", count=true)           //SQL Equivalent : select count(*) from STUDENT where course=?
      Integer getStudentCountByCourse(String course);

      //Sorting
      @Query(value = "{course:?0}", sort= "{name:1}") //ASC
      //@Query(value = "{course=?0}", sort= "{name:-1}") //DESC
      List<Student> getStudentByCourseSortByName(String course);
      

////------------------- @Query with Projection ---------------------------------------
      
      
      @Query(value= "{rollno: ?0}", fields="{name:1, course:1}")   // only data of name & course properties will be displayed
      //@Query(value= "{pages: ?0}", fields="{name:1, course:1, fee:1, rollno:1}") // will display all properties data
      List<Student> getStudentNameAndCourseByRollno(Integer rollno);

  
      @Query(value= "{course : ?0}")           // SQL Equivalent : SELECT * FROM STUDENT select * from student where course=?
      List<Student> getAllStudentsByCourse(String course);
	
      
    //------------------MongoDB Regular Expressions--------------------------------------
      @Query("{ course : { $regex : ?0 } }")
       List<Student> getStudentByCourseRegEx(String course);
      
}
