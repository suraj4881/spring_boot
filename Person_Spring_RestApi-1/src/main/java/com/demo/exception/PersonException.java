package com.demo.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;


@Data
public class PersonException {

	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpstatus;
	
}
