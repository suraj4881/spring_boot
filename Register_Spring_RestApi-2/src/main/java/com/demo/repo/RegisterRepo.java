package com.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Register;


@Repository
public interface RegisterRepo extends MongoRepository<Register,String> {

}
