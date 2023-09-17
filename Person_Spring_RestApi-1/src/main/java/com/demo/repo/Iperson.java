package com.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Person;


@Repository
public interface Iperson extends MongoRepository<Person,String> {

}
