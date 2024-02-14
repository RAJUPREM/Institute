package com.shreemanancareercenter.Dto;

import java.util.List;

public class CourseDto {
	
	 public CourseDto() {
		super();
	}

	public CourseDto(String courseName, String courseDetails, String courseDuration, int courseCharge,
			List<CourseSyllabusDto> courseSyllabusDtoList) {
		super();
		this.courseName = courseName;
		this.courseDetails = courseDetails;
		this.courseDuration = courseDuration;
		this.courseCharge = courseCharge;
		this.courseSyllabusDtoList = courseSyllabusDtoList;
	}

	private String courseName;
	 private String courseDetails;
	 private String courseDuration;
	 private int courseCharge;

//	 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	 private List<Subject> subjectList;
	 
	 
	 
	 private List<CourseSyllabusDto> courseSyllabusDtoList;

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

	public List<CourseSyllabusDto> getCourseSyllabusDtoList() {
		return courseSyllabusDtoList;
	}

	public void setCourseSyllabusDtoList(List<CourseSyllabusDto> courseSyllabusDtoList) {
		this.courseSyllabusDtoList = courseSyllabusDtoList;
	}

	@Override
	public String toString() {
		return "CourseDto [courseName=" + courseName + ", courseDetails=" + courseDetails + ", courseDuration="
				+ courseDuration + ", courseCharge=" + courseCharge + ", courseSyllabusDtoList=" + courseSyllabusDtoList
				+ "]";
	}

}
