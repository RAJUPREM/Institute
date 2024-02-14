package com.shreemanancareercenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreemanancareercenter.entity.Subject;
import com.shreemanancareercenter.servicesImpl.SubjectServiceImpl;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	SubjectServiceImpl subjectServiceImpl;
	
	@PostMapping("/createSubject")
	public ResponseEntity<String> addSubject(@RequestBody Subject subject)
	{
		subjectServiceImpl.addSubject(subject);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}
	
	@GetMapping("/getSubject")
	public ResponseEntity<List<Subject>> getAllSubjects()
	{
		List<Subject> lsubject=subjectServiceImpl.getAllSubjects();
		return new ResponseEntity<List<Subject>>(lsubject,HttpStatus.OK);
	}
	
	@GetMapping("/getSubject/{subjectId}")
	public ResponseEntity<Subject> getSubjectBySubjectId(@PathVariable int subjectId)
	{
		Subject subject=subjectServiceImpl.getSubjectBySubjectId(subjectId);
		return new ResponseEntity<Subject>(subject,HttpStatus.OK);
	}

}
