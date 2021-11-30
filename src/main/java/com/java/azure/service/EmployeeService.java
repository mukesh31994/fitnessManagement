package com.java.azure.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.azure.dao.EmployeeDao;
import com.java.azure.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao lEmployeeDao;
	
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> lEmployeeList  = lEmployeeDao.getAllEmployee();
		ArrayList<Employee> sortedList = (ArrayList<Employee>) lEmployeeList.stream()
				.sorted(Comparator.comparingInt(Employee::getEmpId))
//				 .sorted(Comparator.comparingInt(Employee::getEmpId).reversed())
				.collect(Collectors.toList());
		return sortedList;
	}

}
