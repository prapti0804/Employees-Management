package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServices {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartment(){
		return departmentRepository.findAll();
	}
	
	public Department addDepartment(Department department) {
   	 Department saveDepartment=departmentRepository.save(department);
   	 return saveDepartment;
   	 
    }
}
