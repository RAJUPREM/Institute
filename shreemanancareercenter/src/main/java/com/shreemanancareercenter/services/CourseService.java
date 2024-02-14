package com.shreemanancareercenter.services;

import java.util.List;

import com.shreemanancareercenter.Dto.CourseDto;
import com.shreemanancareercenter.entity.Course;

public interface CourseService {
	
	public void addCourse(CourseDto courseDto);
	
	public Course getCourseByCourseId(int courseId);
	
	public List<Course> getAllCourse();
	
	public Course getCourseByStudentId(int studentId);

}
