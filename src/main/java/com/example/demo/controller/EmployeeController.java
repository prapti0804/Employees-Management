package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.AttendenceService;
import com.example.demo.services.DepartmentServices;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@Autowired
	private DepartmentServices departmentServices;
	
	@Autowired
	private AttendenceService attendenceService;
	
	@GetMapping("/employee")
	public Employee getAllEmployee(Authentication authentication){
		
		String email="1234";
		return employeeServices.getEmployee(email);
	}

	
	
	
	
	
	
	
	
	
	
	@PutMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServices.addEmployee(employee);
	}
	
	@GetMapping("/department")
	public list<>
	
}
