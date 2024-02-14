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

import com.shreemanancareercenter.Dto.BatchDto;
import com.shreemanancareercenter.entity.Batch;
import com.shreemanancareercenter.servicesImpl.BatchServiceImpl;

@RestController
@RequestMapping("/batch")
public class BatchController {
	
	
	@Autowired
	BatchServiceImpl batchServiceImpl;
	
	
	@PostMapping("/createBatch")
	public ResponseEntity<String> addBatch(@RequestBody BatchDto batchDto)
	{
		System.out.println(batchDto);
		batchServiceImpl.addBatch(batchDto);
		return new ResponseEntity<String>("Added",HttpStatus.OK);
	}
	
	@GetMapping("/getBatch")
	public ResponseEntity<List<Batch>> getAllBatch()
	{
		List<Batch> lbatch=batchServiceImpl.getAllBatch();
		return new ResponseEntity<List<Batch>>(lbatch,HttpStatus.OK);
	}

}
