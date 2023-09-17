package com.demo.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;


@Data
@Document(value="customer")
public class Customer {

	@Id
	private Integer cno;
	private String cname;
	private Float billAmount;
	private String[] teamNames;	
	private List<String> studies;
	private Set<Long> phoneNumbers;
	public Map<String,Object> idDetails;
	
	public Company company;
	
}
