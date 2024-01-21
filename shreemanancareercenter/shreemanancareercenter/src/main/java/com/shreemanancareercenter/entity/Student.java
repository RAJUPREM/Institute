package com.shreemanancareercenter.entity;

import jakarta.persistence.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class Student {
	
	
	public Student(int studentId, String studentName, String studentFathersName, String studentsDOB,
			String studentGender, String studentAcademicQualification, String studentProfessionalQualification,
			String studentCategory, String studentMobile, Address address, List<Course> course, Fee fee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFathersName = studentFathersName;
		this.studentsDOB = studentsDOB;
		this.studentGender = studentGender;
		this.studentAcademicQualification = studentAcademicQualification;
		this.studentProfessionalQualification = studentProfessionalQualification;
		this.studentCategory = studentCategory;
		this.studentMobile = studentMobile;
		this.address = address;
		this.course = course;
		this.fee = fee;
	}

	public Student() {
		super();
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;
	private String studentName;
	private String studentFathersName;
	private String studentsDOB;
	private String studentGender;
	private String studentAcademicQualification;
	private String studentProfessionalQualification;
	private String studentCategory;
	private String studentMobile;
	
	@Embedded
	private Address address;
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Course> course;
	
	@JsonManagedReference
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Fee fee;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentFathersName() {
		return studentFathersName;
	}

	public void setStudentFathersName(String studentFathersName) {
		this.studentFathersName = studentFathersName;
	}

	public String getStudentsDOB() {
		return studentsDOB;
	}

	public void setStudentsDOB(String studentsDOB) {
		this.studentsDOB = studentsDOB;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentAcademicQualification() {
		return studentAcademicQualification;
	}

	public void setStudentAcademicQualification(String studentAcademicQualification) {
		this.studentAcademicQualification = studentAcademicQualification;
	}

	public String getStudentProfessionalQualification() {
		return studentProfessionalQualification;
	}

	public void setStudentProfessionalQualification(String studentProfessionalQualification) {
		this.studentProfessionalQualification = studentProfessionalQualification;
	}

	public String getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public Fee getFee() {
		return fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFathersName="
				+ studentFathersName + ", studentsDOB=" + studentsDOB + ", studentGender=" + studentGender
				+ ", studentAcademicQualification=" + studentAcademicQualification
				+ ", studentProfessionalQualification=" + studentProfessionalQualification + ", studentCategory="
				+ studentCategory + ", studentMobile=" + studentMobile + ", address=" + address + ", course=" + course
				+ ", fee=" + fee + "]";
	}

}
