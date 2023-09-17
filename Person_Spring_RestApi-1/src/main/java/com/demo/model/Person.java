package com.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Document(collection="person")
public class Person {

	@Id
	private String id;
	private String name;
	private String city;
	private String email;
	private long ph;
	
}
