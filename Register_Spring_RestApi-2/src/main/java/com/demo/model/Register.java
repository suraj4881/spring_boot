package com.demo.model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;


@Data
@Document(collection="register")
public class Register {

	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String dob;
	private Long mobileNo;
	
}
