package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.services.DepartmentServices;

@RestController
@RequestMapping
public class DepartmentController {
	@Autowired
	private DepartmentServices departmentServices;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		return departmentServices.getAllDepartment();
	}
    
	@PutMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		return departmentServices.addDepartment(department);
	}
}
