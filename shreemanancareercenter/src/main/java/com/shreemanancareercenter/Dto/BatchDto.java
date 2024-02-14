package com.shreemanancareercenter.Dto;

import java.util.List;


public class BatchDto {
	
	public BatchDto() {
		super();
	}


	public BatchDto(int batchId, int batchNumber, String batchTiming, String batchStatus, String batchAlert,
			List<String> batchDays, List<Integer> studentIdList, List<Integer> teacherIdList) {
		super();
		this.batchId = batchId;
		this.batchNumber = batchNumber;
		this.batchTiming = batchTiming;
		this.batchStatus = batchStatus;
		this.batchAlert = batchAlert;
		this.batchDays = batchDays;
		this.studentIdList = studentIdList;
		this.teacherIdList = teacherIdList;
	}


	private int batchId;
	private int batchNumber;
	private String batchTiming;
	private String batchStatus;
	private String batchAlert;
	private List<String> batchDays;
	
	
	private List<Integer> studentIdList;
	
	
	private List<Integer> teacherIdList;


	public int getBatchId() {
		return batchId;
	}


	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}


	public int getBatchNumber() {
		return batchNumber;
	}


	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}


	public String getBatchTiming() {
		return batchTiming;
	}


	public void setBatchTiming(String batchTiming) {
		this.batchTiming = batchTiming;
	}


	public String getBatchStatus() {
		return batchStatus;
	}


	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}


	public String getBatchAlert() {
		return batchAlert;
	}


	public void setBatchAlert(String batchAlert) {
		this.batchAlert = batchAlert;
	}


	public List<String> getBatchDays() {
		return batchDays;
	}


	public void setBatchDays(List<String> batchDays) {
		this.batchDays = batchDays;
	}


	public List<Integer> getStudentIdList() {
		return studentIdList;
	}


	public void setStudentIdList(List<Integer> studentIdList) {
		this.studentIdList = studentIdList;
	}


	public List<Integer> getTeacherIdList() {
		return teacherIdList;
	}


	public void setTeacherIdList(List<Integer> teacherIdList) {
		this.teacherIdList = teacherIdList;
	}


	@Override
	public String toString() {
		return "BatchDto [batchId=" + batchId + ", batchNumber=" + batchNumber + ", batchTiming=" + batchTiming
				+ ", batchStatus=" + batchStatus + ", batchAlert=" + batchAlert + ", batchDays=" + batchDays
				+ ", studentIdList=" + studentIdList + ", teacherIdList=" + teacherIdList + "]";
	}

}
