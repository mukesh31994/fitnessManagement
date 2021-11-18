package com.java.azure.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FitnessManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessManagementApplication.class, args);
	}
	
	@GetMapping("welcome")
	public String getMessage() {
		return "Welcome to Azure Web App Commit 3";
	}
	
	@GetMapping("/")
	public String home() {
		return "CICD successfully version 3";
	}

}
