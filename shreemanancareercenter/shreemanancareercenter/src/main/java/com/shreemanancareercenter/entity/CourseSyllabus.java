package com.shreemanancareercenter.entity;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class CourseSyllabus {
	
	
	public CourseSyllabus() {
		super();
	}

	public CourseSyllabus(int courseSyllabusId, Course course, Subject subject, String syllabus) {
		super();
		this.courseSyllabusId = courseSyllabusId;
		this.course = course;
		this.subject = subject;
		this.syllabus = syllabus;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int courseSyllabusId;
	
	
	@JsonBackReference
	@ManyToOne(cascade=CascadeType.ALL)
	private Course course;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Subject subject;
	
	private String syllabus;

	public int getCourseSyllabusId() {
		return courseSyllabusId;
	}

	public void setCourseSyllabusId(int courseSyllabusId) {
		this.courseSyllabusId = courseSyllabusId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	@Override
	public String toString() {
		return "CourseSyllabus [courseSyllabusId=" + courseSyllabusId + ", course=" + course + ", subject=" + subject
				+ ", syllabus=" + syllabus + "]";
	}

}
