package com.shreemanancareercenter.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.repository.CourseRepository;
import com.shreemanancareercenter.repository.SubjectRepository;
import com.shreemanancareercenter.services.CourseService;


@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public Course getCourseByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
