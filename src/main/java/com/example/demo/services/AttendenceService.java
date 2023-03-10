package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendence;
import com.example.demo.repository.AttendenceRepository;


@Service
public class AttendenceService {
	@Autowired
	private AttendenceRepository attendenceRepository;
	
	public List<Attendence> getAllAttendence() {
		return attendenceRepository.findAll();
	}
	
	public Attendence addAttendence (int eId) {
		Attendence attendence= new Attendence();
		attendence.setAttendence_date(Date.valueOf(LocalDate.now()));
		attendence.setEmployee(null);
		Attendence savedAttendence = attendenceRepository.save(attendence);
		return savedAttendence;
	}

	
}
