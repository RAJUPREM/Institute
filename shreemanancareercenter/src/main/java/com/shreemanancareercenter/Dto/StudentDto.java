package com.shreemanancareercenter.Dto;

import java.util.Date;
import java.util.List;

import com.shreemanancareercenter.entity.Address;




public class StudentDto {
	

	
	public StudentDto(String studentName, String studentFathersName, Date studentsDOB, String studentGender,
			String studentAcademicQualification, String studentProfessionalQualification, String studentCategory,
			String studentMobile, Address address, List<Integer> courseId, int totalNumberInstallment,
			int discountPercent) {
		super();
		this.studentName = studentName;
		this.studentFathersName = studentFathersName;
		this.studentsDOB = studentsDOB;
		this.studentGender = studentGender;
		this.studentAcademicQualification = studentAcademicQualification;
		this.studentProfessionalQualification = studentProfessionalQualification;
		this.studentCategory = studentCategory;
		this.studentMobile = studentMobile;
		this.address = address;
		this.courseId = courseId;
		this.totalNumberInstallment = totalNumberInstallment;
		this.discountPercent = discountPercent;
	}
	public StudentDto() {
		super();
	}
	
	private String studentName;
	private String studentFathersName;
	private Date studentsDOB;
	private String studentGender;
	private String studentAcademicQualification;
	private String studentProfessionalQualification;
	private String studentCategory;
	private String studentMobile;

	private Address address;

	private List<Integer> courseId;
	
	private int totalNumberInstallment;
	private int discountPercent;
//	private int netFee;

	
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
	public List<Integer> getCourseId() {
		return courseId;
	}
	public void setCourseId(List<Integer> courseId) {
		this.courseId = courseId;
	}
	public int getTotalNumberInstallment() {
		return totalNumberInstallment;
	}
	public void setTotalNumberInstallment(int totalNumberInstallment) {
		this.totalNumberInstallment = totalNumberInstallment;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Date getStudentsDOB() {
		return studentsDOB;
	}
	public void setStudentsDOB(Date studentsDOB) {
		this.studentsDOB = studentsDOB;
	}
	@Override
	public String toString() {
		return "StudentDto [studentName=" + studentName + ", studentFathersName=" + studentFathersName
				+ ", studentsDOB=" + studentsDOB + ", studentGender=" + studentGender
				+ ", studentAcademicQualification=" + studentAcademicQualification
				+ ", studentProfessionalQualification=" + studentProfessionalQualification + ", studentCategory="
				+ studentCategory + ", studentMobile=" + studentMobile + ", address=" + address + ", courseId="
				+ courseId + ", totalNumberInstallment=" + totalNumberInstallment + ", discountPercent="
				+ discountPercent + "]";
	}
	
	
	
	
	

}
