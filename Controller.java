package com.test;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@Autowired
	Service service;

	@PostMapping("/user")
	public CompletableFuture<String> usersStatus1() {
//		logger.info("1");
//
//		logger.info(Thread.currentThread().getName());
//		service.asyncMethod();
//		logger.info(Thread.currentThread().getName());
//		logger.info("2");
//		logger.info(Thread.currentThread().getName());
//		service.asyncMethod();
//		logger.info(Thread.currentThread().getName());
//		logger.info("3");

		return CompletableFuture.completedFuture("welcome");
	}

	@PutMapping("/user")
	public ResponseEntity<?> na() throws InternalServerError {

		System.out.println(10 / 0);

		return ResponseEntity.ok("ok");
	}

}
