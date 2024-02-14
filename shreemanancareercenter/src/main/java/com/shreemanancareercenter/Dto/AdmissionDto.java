package com.shreemanancareercenter.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shreemanancareercenter.entity.Student;


public class AdmissionDto {
	

	public AdmissionDto(Date admissionDate, StudentDto studentDto, int batchId, String admissionRemarksComments) {
		super();
		this.admissionDate = admissionDate;
		this.studentDto = studentDto;
		this.batchId = batchId;
		this.admissionRemarksComments = admissionRemarksComments;
	}

	public AdmissionDto() {
		super();
	}

	
	@JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
	private Date admissionDate;
	
	
	private StudentDto studentDto;
	
	
	private int batchId;
	
	private String admissionRemarksComments;

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getAdmissionRemarksComments() {
		return admissionRemarksComments;
	}

	public void setAdmissionRemarksComments(String admissionRemarksComments) {
		this.admissionRemarksComments = admissionRemarksComments;
	}

	public StudentDto getStudentDto() {
		return studentDto;
	}

	public void setStudentDto(StudentDto studentDto) {
		this.studentDto = studentDto;
	}

	@Override
	public String toString() {
		return "AdmissionDto [admissionDate=" + admissionDate + ", studentDto=" + studentDto + ", batchId=" + batchId
				+ ", admissionRemarksComments=" + admissionRemarksComments + "]";
	}

	

}
