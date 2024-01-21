package com.shreemanancareercenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.servicesImpl.CourseServiceImpl;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@PostMapping("/createCourse")
	public ResponseEntity<String> addCourse(@RequestBody Course course)
	{
		courseServiceImpl.addCourse(course);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}

}
