package com.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.search.util.LocationNotFound;

@ControllerAdvice
public class ExceptionHandeling {
	
	@ExceptionHandler(LocationNotFound.class)
	public ResponseEntity<Object> exceptionHandeling(LocationNotFound exception) {
		return new ResponseEntity<Object>("location not found", HttpStatus.NOT_FOUND);
	}

}
