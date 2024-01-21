package com.shreemanancareercenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreemanancareercenter.entity.Teacher;
import com.shreemanancareercenter.servicesImpl.TeacherServiceImpl;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	@PostMapping("/createTeacher")
	public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher)
	{
		teacherServiceImpl.addTeacher(teacher);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}

}
