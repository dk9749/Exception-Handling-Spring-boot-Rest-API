package com.test;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

//for all exception handling 
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<?> handleResourceNotFoundException(Exception exception, WebRequest request) {
//		Error error = new Error("Resource not found!!!!!", request.getDescription(false), new Date());
//		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
//
//	}

//	for custom Exception handling when you use throw clause to throw this exception and it will handle from here globally
	@ExceptionHandler(InternalServerError.class)
	public ResponseEntity<?> handleInternalServerError(InternalServerError exception, WebRequest request) {
		Error error = new Error("InternalServerError!!!!!", request.getDescription(false), new Date());
		return new ResponseEntity<Error>(error, HttpStatus.INTERNAL_SERVER_ERROR);

	}

// for pre-defined exception handling
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<?> handleArithmeticException(ArithmeticException exception, WebRequest request) {
		Error error = new Error("ArithmeticException!!!!!", request.getDescription(false), new Date());
		return new ResponseEntity<Error>(error, HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
