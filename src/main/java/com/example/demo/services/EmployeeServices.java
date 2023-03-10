package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	 
	public List<Employee> getAllEmployee(){
   	 return employeeRepository.findAll();
    }

	
	 public Employee addEmployee(Employee employee) {
    	 Employee saveEmployee=employeeRepository.save(employee);
    	 return saveEmployee;
    	 
     }


	public Employee getEmployee(String email) {
		employeeRepository.findByEmail(email);
		return null;
	}
	
	

}
