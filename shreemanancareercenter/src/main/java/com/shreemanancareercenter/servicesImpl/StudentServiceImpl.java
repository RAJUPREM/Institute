package com.shreemanancareercenter.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.Dto.StudentDto;
import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.entity.Fee;
import com.shreemanancareercenter.entity.Student;
import com.shreemanancareercenter.repository.CourseRepository;
import com.shreemanancareercenter.repository.StudentRepository;
import com.shreemanancareercenter.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public void addStudent(StudentDto studentDto) {
		
		Student student=new Student();
		Fee fee=new Fee();
		
		student.setStudentName(studentDto.getStudentName());
		student.setStudentFathersName(studentDto.getStudentFathersName());
		student.setStudentsDOB(studentDto.getStudentsDOB());
		student.setStudentGender(studentDto.getStudentGender());
		student.setStudentAcademicQualification(studentDto.getStudentAcademicQualification());
		student.setStudentProfessionalQualification(studentDto.getStudentProfessionalQualification());
		student.setStudentCategory(studentDto.getStudentCategory());
		student.setStudentMobile(studentDto.getStudentMobile());
		
		student.setAddress(studentDto.getAddress());
		
		List<Course> lcourse=new ArrayList<Course>();
		
		for(int i=0;i<studentDto.getCourseId().size();i++)
		{
			Optional<Course> tempCourse=courseRepository.findById(studentDto.getCourseId().get(i));
			Course course=tempCourse.get();
			lcourse.add(course);
		}
		
		student.setCourse(lcourse);
		
		
		
		
		fee.setTotalNumberInstallment(studentDto.getTotalNumberInstallment());
		fee.setDiscountPercent(studentDto.getDiscountPercent());
		//fee.setNetFee(studentDto.getNetFee());
		
		student.setFee(fee);
		
		
		studentRepository.save(student);
		
	}

}
