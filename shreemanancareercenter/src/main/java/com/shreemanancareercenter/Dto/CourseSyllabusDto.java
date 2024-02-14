package com.shreemanancareercenter.Dto;


import com.shreemanancareercenter.entity.Course;


public class CourseSyllabusDto {
	
public CourseSyllabusDto(int courseSyllabusId, Course course, String subjectId, String syllabus) {
		super();
		this.courseSyllabusId = courseSyllabusId;
		this.course = course;
		this.subjectId = subjectId;
		this.syllabus = syllabus;
	}

public CourseSyllabusDto() {
		super();
	}



private int courseSyllabusId;
	
	
	private Course course;
	
	private String subjectId;
	
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


	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "CourseSyllabusDto [courseSyllabusId=" + courseSyllabusId + ", course=" + course + ", subjectId="
				+ subjectId + ", syllabus=" + syllabus + "]";
	}

	

}
