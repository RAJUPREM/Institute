package com.shreemanancareercenter.services;

import java.util.List;

import com.shreemanancareercenter.Dto.AdmissionDto;
import com.shreemanancareercenter.entity.Admission;

public interface AdmissionService {
	
	public void addAdmission(AdmissionDto admissionDto);
	
	public List<Admission> getAdmission();
	

}
