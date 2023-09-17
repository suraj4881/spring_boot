package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Person;
import com.demo.service.IpersonService;

@RestController
@RequestMapping("/api/")
public class PersonController {

	@Autowired
	private IpersonService ipersonService;

	@PostMapping("/create")
	public ResponseEntity<Person> createPersonDtls(@RequestBody Person person) {

		return new ResponseEntity<Person>(ipersonService.createPerson(person), HttpStatus.CREATED);

	}

	@GetMapping("/getdetls")
	public ResponseEntity<List<Person>> getAllPersonDtls() {

		return new ResponseEntity<List<Person>>(ipersonService.getAllDetls(), HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Person> updatePersonDtls(@PathVariable(value = "id") String id,@RequestBody Person person) {

		return new ResponseEntity<Person>(ipersonService.updatePerson(id ,person), HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePersonDtls(@PathVariable(value = "id") String id) {

		return new ResponseEntity<String>(ipersonService.deletePerson(id), HttpStatus.OK);

	}

}
