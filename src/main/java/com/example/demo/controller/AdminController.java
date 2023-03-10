package com.example.demo.controller;

import java.util.List;

import org.hibernate.sql.ast.tree.insert.Values;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
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
	
	@GetMapping(value = "/employees")
	public ResponseEntity<?> getEmployees(){
		List<Employee> employees = employeeServices.getAllEmployee();
		if(employees==null || employees.size()==0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Employee Found");
		return ResponseEntity.status(HttpStatus.OK).body(employees);		
	}
	
	@GetMapping("/department/{Id}")
	public ResponseEntity<?> getDepartment(@PathVariable int dID){
		Department department = departmentServices.getDepartment(dID);
		return ResponseEntity.status(HttpStatus.OK).body(department);	
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> getDepartment(){
		List<Department> departments = departmentServices.getAllDepartment();
		if(departments==null || departments.size()==0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No Department Found");
		return ResponseEntity.status(HttpStatus.OK).body(departments);	
	}
	
	@DeleteMapping("/employee/{email}")
	public ResponseEntity<?> deleteEmployee(@PathVariable String email){
		Employee employee = employeeServices.deleteemployee(email);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
	
	@PostMapping("/employee/add")
	public ResponseEntity<?> addToDepartment(@RequestBody Employee employee) {
		Employee addEmployee = employeeServices.addtodepartment(employee);
		if(addEmployee==null)
			return ResponseEntity.status(HttpStatus.FAILED_DEPENDENCY).body("Unable to add employees to department");
		return ResponseEntity.status(HttpStatus.CREATED).body(addEmployee);	
	}
	
	@DeleteMapping("/departments/{Id}")
	public ResponseEntity<?> deleteDepartment(@PathVariable int Id){
		Department department = departmentServices.deleteDepartment(Id);
		return ResponseEntity.status(HttpStatus.OK).body(department);
		
	}
}
