package com.shreemanancareercenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping("/")    
	public String index()  
	{    
	return "index";    
	} 
	
	@RequestMapping("/admission")    
	public String admission()  
	{    
	return "admission";    
	} 
	
	@RequestMapping("/customize")    
	public String customize()  
	{    
	return "customize";    
	} 
	
	@RequestMapping("/search")    
	public String search()  
	{    
	return "search";    
	} 

}
