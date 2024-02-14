package com.shreemanancareercenter.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.Dto.CourseDto;
import com.shreemanancareercenter.Dto.CourseSyllabusDto;
import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.entity.CourseSyllabus;
import com.shreemanancareercenter.entity.Subject;
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
	public void addCourse(CourseDto courseDto) {
		
		Course course=new Course();
		
		course.setCourseName(courseDto.getCourseName());
		course.setCourseDetails(courseDto.getCourseDetails());
		course.setCourseDuration(courseDto.getCourseDuration());
		course.setCourseCharge(courseDto.getCourseCharge());
		
		List<CourseSyllabus> lCourseSyllabus=new ArrayList<CourseSyllabus>();
		
		for(int i=0;i<courseDto.getCourseSyllabusDtoList().size();i++)
		{
			CourseSyllabus courseSyllabus=new CourseSyllabus();
			CourseSyllabusDto courseSyllabusDto= courseDto.getCourseSyllabusDtoList().get(i);
			
			Optional<Subject> tempSubject=subjectRepository.findById(Integer.parseInt(courseSyllabusDto.getSubjectId()));
			Subject subject=tempSubject.get();
			
			
			courseSyllabus.setSubject(subject);
			courseSyllabus.setSyllabus(courseSyllabusDto.getSyllabus());
			lCourseSyllabus.add(courseSyllabus);
		}
		
		
		course.setCourseSyllabusList(lCourseSyllabus);
		
		courseRepository.save(course);
	}

	@Override
	public Course getCourseByCourseId(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		List<Course> lcourse=courseRepository.findAll();
		return lcourse;
	}

	@Override
	public Course getCourseByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
