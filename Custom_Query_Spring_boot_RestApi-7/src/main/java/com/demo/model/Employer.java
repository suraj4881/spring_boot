package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="employer")
public class Employer {

	@Id
	private String id;
	private String name;
	private Integer age;
	private String email;
	private Double salary;
	
}
