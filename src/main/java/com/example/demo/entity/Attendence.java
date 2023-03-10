package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendence {
	@Id
	private int id;
	private String employeeName;
	private boolean isPresent;
	private Date Attendence_date;
	
	@OneToOne(fetch = FetchType.EAGER,mappedBy = "eId")
	Employee employee;
	
}

