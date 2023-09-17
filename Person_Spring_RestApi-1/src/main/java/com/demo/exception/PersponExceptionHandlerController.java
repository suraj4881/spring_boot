package com.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PersponExceptionHandlerController {

	@ExceptionHandler(value= {PersonNotFoundException.class})
	public ResponseEntity<Object> handlerPersonNotFoundException(PersonNotFoundException personNotFoundException){
		
		PersonException personex= new PersonException(
				
				personNotFoundException.getMessage(),
				personNotFoundException.getCause(),
				HttpStatus.NOT_FOUND
				
				);
		
		
		return new ResponseEntity<>(personex,HttpStatus.NOT_FOUND);
		
		
	}
	
	
}
