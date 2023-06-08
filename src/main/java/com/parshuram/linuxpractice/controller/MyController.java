package com.parshuram.linuxpractice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private Logger logger=LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/welcome")
	public String getMessage() {
		
		logger.info("getMessage() Method Execution started...");
		
		String message="Welcome to REST API Development.....";
		
		logger.info("getMessage() Method Execution Ended...");
		
		return message;
	}
	
	
	@GetMapping("/message")
	public ResponseEntity<String> getMsg(){
		
		logger.info("getMsg() Method Returning Status Code with Message.....");
		
		String message="REST API with The Status code....";
		
		logger.info("Status Code with Message Returned");
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
	
	}
	
	
	@GetMapping("/way3")
	public ResponseEntity<String> getMessageByThirdWay(){
		
		logger.warn("getMessageByThirdWay() Method Executed...");
		
		String message="Hello REST API......";
		
		logger.warn("Returned the Message with Only Body...");
		
		return ResponseEntity.ok().body(message);
	}
	

	@GetMapping("/greet")
	public String getGreetMesssage(){
		
		logger.info("getGreetMessage() Method Execution Started.....");
		
		String message="Good Afternoon";
		
		logger.info("Good Afternoon Message is Returned.....");
		
		return message;
	}


}
