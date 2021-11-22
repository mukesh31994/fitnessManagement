package com.java.azure.dao;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.java.azure.entity.Employee;

@Service
public class EmployeeDao {

	public ArrayList<Employee> getAllEmployee() {
		
		ArrayList<Employee> lList = new ArrayList<Employee>();
		lList.add(new Employee(1, "Aniket", "Naik", 50000, "Senior Consultant"));
		lList.add(new Employee(2, "Bharat", "Sharma", 45000, "Consultant"));
		lList.add(new Employee(3, "Chintan", "Jain", 70000, "Manager"));
		lList.add(new Employee(4, "Karan", "Verma", 40000, "Associate Consultant"));
		lList.add(new Employee(5, "Mohit", "Pande", 47000, "Consultant"));
		lList.add(new Employee(6, "Devendra", "Agarwal", 30000, "Trainee"));
		
		return lList;
		
	}
}
