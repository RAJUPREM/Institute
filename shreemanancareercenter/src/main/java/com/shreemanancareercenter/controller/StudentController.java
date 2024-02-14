package com.shreemanancareercenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreemanancareercenter.Dto.StudentDto;
import com.shreemanancareercenter.servicesImpl.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/createStudent")
	public ResponseEntity<String> addStudent(@RequestBody StudentDto studentDto)
	{
		studentServiceImpl.addStudent(studentDto);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}

}
