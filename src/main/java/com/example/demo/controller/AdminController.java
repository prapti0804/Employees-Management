package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.services.AttendenceService;
import com.example.demo.services.DepartmentServices;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@Autowired
	private DepartmentServices departmentServices;
	
	@Autowired
	private AttendenceService attendenceService;

	@GetMapping("/employee/{email}")
	public ResponseEntity<?> getEmployee(@PathVariable String email){
		Employee employee = employeeServices.getEmployee(email);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
	
	
}
