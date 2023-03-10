package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeServices.getAllEmployee();
	}

	@PutMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServices.addEmployee(employee);
	}
}
