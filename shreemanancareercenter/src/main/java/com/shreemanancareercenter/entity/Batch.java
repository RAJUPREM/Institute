package com.shreemanancareercenter.entity;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Batch {
	
	public Batch(int batchId, int batchNumber, String batchTiming, String batchStatus, String batchAlert,
			String batchDays, List<Student> studentList, List<Teacher> teacherList) {
		super();
		this.batchId = batchId;
		this.batchNumber = batchNumber;
		this.batchTiming = batchTiming;
		this.batchStatus = batchStatus;
		this.batchAlert = batchAlert;
		this.batchDays = batchDays;
		this.studentList = studentList;
		this.teacherList = teacherList;
	}

	public Batch() {
		super();
	}

	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int batchId;
	private int batchNumber;
	private String batchTiming;
	private String batchStatus;
	private String batchAlert;
	private String batchDays;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Student> studentList;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Teacher> teacherList;

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

	

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public String getBatchDays() {
		return batchDays;
	}

	public void setBatchDays(String batchDays) {
		this.batchDays = batchDays;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchNumber=" + batchNumber + ", batchTiming=" + batchTiming
				+ ", batchStatus=" + batchStatus + ", batchAlert=" + batchAlert + ", batchDays=" + batchDays
				+ ", studentList=" + studentList + ", teacherList=" + teacherList + "]";
	}

	

}
