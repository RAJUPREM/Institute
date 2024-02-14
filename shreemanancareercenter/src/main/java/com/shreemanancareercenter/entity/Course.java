package com.shreemanancareercenter.entity;

import java.util.List;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Course {
	
	public Course(int courseId, String courseName, String courseDetails, String courseDuration, int courseCharge,
			List<CourseSyllabus> courseSyllabusList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.courseDuration = courseDuration;
		this.courseCharge = courseCharge;
		this.courseSyllabusList = courseSyllabusList;
	}


	public Course() {
		super();
	}


	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseId;
	 private String courseName;
	 private String courseDetails;
	 private String courseDuration;
	 private int courseCharge;

//	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	 private List<Subject> subjectList;
	 
	 
	 @JsonManagedReference
	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 private List<CourseSyllabus> courseSyllabusList;


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDetails() {
		return courseDetails;
	}


	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}


	public String getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}


	public int getCourseCharge() {
		return courseCharge;
	}


	public void setCourseCharge(int courseCharge) {
		this.courseCharge = courseCharge;
	}


	


	public List<CourseSyllabus> getCourseSyllabusList() {
		return courseSyllabusList;
	}


	public void setCourseSyllabusList(List<CourseSyllabus> courseSyllabusList) {
		this.courseSyllabusList = courseSyllabusList;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDetails=" + courseDetails
				+ ", courseDuration=" + courseDuration + ", courseCharge=" + courseCharge + ", courseSyllabusList="
				+ courseSyllabusList + "]";
	}


	

}
