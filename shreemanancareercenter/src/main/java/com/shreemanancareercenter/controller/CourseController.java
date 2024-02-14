package com.shreemanancareercenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreemanancareercenter.Dto.CourseDto;
import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.servicesImpl.CourseServiceImpl;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@PostMapping("/createCourse")
	public ResponseEntity<String> addCourse(@RequestBody CourseDto courseDto)
	{
		System.out.println(courseDto);
		courseServiceImpl.addCourse(courseDto);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}
	
	@GetMapping("/getCourse")
	public ResponseEntity<List<Course>> getAllCourse()
	{

		List<Course> lcourse=courseServiceImpl.getAllCourse();
		return new ResponseEntity<List<Course>>(lcourse,HttpStatus.OK);
	}

}
