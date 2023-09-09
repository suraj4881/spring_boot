package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Employer;

public interface EmployerRepo extends JpaRepository<Employer,Long> {

}
