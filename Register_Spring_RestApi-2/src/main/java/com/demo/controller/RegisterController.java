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

import com.demo.model.Register;
import com.demo.service.RegisterService;

@RestController
@RequestMapping(value="/api/")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	
	@PostMapping("/create")
	public ResponseEntity<Register> createRegisterDetls(@RequestBody Register register){
		
		
		return new ResponseEntity<Register>(registerService.createRegister(register),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getalldetls")
	public ResponseEntity<List<Register>> getAllRegisterDetls() {

		return new ResponseEntity<List<Register>>(registerService.getAllDetls(), HttpStatus.OK);

	}
	@GetMapping("/getadetls/{id}")
	public ResponseEntity<Register> getARegisterDetls(@PathVariable(value="id") String id) {

		return new ResponseEntity<Register>(registerService.getADetls(id), HttpStatus.OK);

	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Register> UpdateRegisterDetls(@PathVariable(value="id") String id,@RequestBody Register register) {

		return new ResponseEntity<Register>(registerService.updateRegister(id, register), HttpStatus.OK);

	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteRegisterDetls(@PathVariable(value="id") String id) {

		return new ResponseEntity<String>(registerService.deleteRegister(id), HttpStatus.OK);

	}
	
}
