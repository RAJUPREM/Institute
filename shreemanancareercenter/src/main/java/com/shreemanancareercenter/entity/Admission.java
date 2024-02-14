package com.shreemanancareercenter.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Admission {
	
	public Admission() {
		super();
	}

	public Admission(int admissionNumber, Date admissionDate, Student student, Batch batch,
			String admissionRemarksComments) {
		super();
		this.admissionNumber = admissionNumber;
		this.admissionDate = admissionDate;
		this.student = student;
		this.batch = batch;
		this.admissionRemarksComments = admissionRemarksComments;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int admissionNumber;
	private Date admissionDate;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Student student;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Batch batch;
	
	private String admissionRemarksComments;

	public int getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public String getAdmissionRemarksComments() {
		return admissionRemarksComments;
	}

	public void setAdmissionRemarksComments(String admissionRemarksComments) {
		this.admissionRemarksComments = admissionRemarksComments;
	}

	@Override
	public String toString() {
		return "Admission [admissionNumber=" + admissionNumber + ", admissionDate=" + admissionDate + ", student="
				+ student + ", batch=" + batch + ", admissionRemarksComments=" + admissionRemarksComments + "]";
	}
	

}
