package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int eId;
	private String ename;
	private String address;
	private long Phone;
	private String email;
	private double salary;
	private String Department;
	private String Designation;
	private Date joiniDate;
 
}
