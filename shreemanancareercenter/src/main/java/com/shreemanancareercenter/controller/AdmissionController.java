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

import com.shreemanancareercenter.Dto.AdmissionDto;
import com.shreemanancareercenter.entity.Admission;
import com.shreemanancareercenter.servicesImpl.AdmissionServiceImpl;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
	
	@Autowired
	AdmissionServiceImpl admissionServiceImpl;
	
	@PostMapping("/createAdmission")
	public ResponseEntity<String> addAdmission(@RequestBody AdmissionDto admissionDto)
	{
		System.out.println(admissionDto);
		admissionServiceImpl.addAdmission(admissionDto);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}
	
	@GetMapping("/getAdmission")
	public ResponseEntity<List<Admission>> getAdmission()
	{
		List<Admission> ladmission=admissionServiceImpl.getAdmission();
		return new ResponseEntity<List<Admission>>(ladmission,HttpStatus.OK);
	}

}
