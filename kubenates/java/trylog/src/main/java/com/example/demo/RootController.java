package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	private Logger logger = LoggerFactory.getLogger(RootController.class);
	@GetMapping("/")
	public String helloWorld() {
		logger.info("hello world...");
		return "hello world";
	}
}
