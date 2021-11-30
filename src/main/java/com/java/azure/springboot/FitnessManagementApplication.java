package com.java.azure.springboot;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.azure.entity.Employee;
import com.java.azure.service.EmployeeService;

@SpringBootApplication
@RestController
@ComponentScan({ "com.java.azure.service", "com.java.azure.dao" })
public class FitnessManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessManagementApplication.class, args);
	}

	@Autowired
	EmployeeService lEmployeeService;
	
	@GetMapping("getAllEmployee")
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> list = lEmployeeService.getAllEmployee();
		return list;
	}

	@GetMapping("welcome")
	public String getMessage() {
		return "Welcome to Azure Web App Commit 3";
	}

	@GetMapping("/")
	public String home() {
		return "CICD successfully version 3";
	}
	
//	@GetMapping("getAllEmployee")
//	public ModelAndView getAllEmployee() {
//		ArrayList<Employee> list = lEmployeeService.getAllEmployee();
//		return new ModelAndView("ShowEmployee", "employeeList", list);
//	}

}
