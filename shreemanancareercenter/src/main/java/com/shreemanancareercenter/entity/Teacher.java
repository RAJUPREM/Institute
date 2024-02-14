package com.shreemanancareercenter.entity;

import jakarta.persistence.*;

@Entity
public class Teacher {
	
	public Teacher() {
		super();
	}

	public Teacher(int teacherId, String teacherName, String teacherGender, String teacherProfessionalQualification,
			String teacherMobile, String teacherSubject, Address address) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherGender = teacherGender;
		this.teacherProfessionalQualification = teacherProfessionalQualification;
		this.teacherMobile = teacherMobile;
		this.teacherSubject = teacherSubject;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private String teacherGender;
	private String teacherProfessionalQualification;
	private String teacherMobile;
	private String teacherSubject;
	
	@Embedded
	private Address address;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherGender() {
		return teacherGender;
	}

	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}

	public String getTeacherProfessionalQualification() {
		return teacherProfessionalQualification;
	}

	public void setTeacherProfessionalQualification(String teacherProfessionalQualification) {
		this.teacherProfessionalQualification = teacherProfessionalQualification;
	}

	public String getTeacherMobile() {
		return teacherMobile;
	}

	public void setTeacherMobile(String teacherMobile) {
		this.teacherMobile = teacherMobile;
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherGender=" + teacherGender
				+ ", teacherProfessionalQualification=" + teacherProfessionalQualification + ", teacherMobile="
				+ teacherMobile + ", teacherSubject=" + teacherSubject + ", address=" + address + "]";
	}

}
