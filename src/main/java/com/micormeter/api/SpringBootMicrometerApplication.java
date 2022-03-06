package com.micormeter.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMicrometerApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootMicrometerApplication.class);
	
	public void init() {
		logger.info("Application started");
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Its working...";
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(SpringBootMicrometerApplication.class, args);
	}

}
