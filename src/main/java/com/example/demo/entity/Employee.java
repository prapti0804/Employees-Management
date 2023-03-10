package com.example.demo.entity;

import java.sql.Date;

import javax.xml.bind.annotation.XmlSchemaType;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int eId;
	@NotEmpty
	private String ename;
	@NotEmpty
	private String address;
	@NotEmpty
	private long Phone;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private double salary;
	@NotEmpty
	private String Department;
	@NotEmpty
	private String Designation;
	@NotEmpty
	private Date joiniDate;
	@NotEmpty
	private String password;
	private String role;
 
}
