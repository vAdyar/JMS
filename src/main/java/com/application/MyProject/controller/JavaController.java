package com.application.MyProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
	
	@Autowired
	private 	JmsTemplate jmsTemplate;  

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@PostMapping("/send")
	public void sendMessage() {
		System.out.println("Sending message to queue...");
		
		jmsTemplate.convertAndSend("OrderTransactionQueue", "First Message!");
		
	}
	
	
}
