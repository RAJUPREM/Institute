package com.shreemanancareercenter.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.entity.Teacher;
import com.shreemanancareercenter.repository.TeacherRepository;
import com.shreemanancareercenter.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public void addTeacher(Teacher teacher) {	
		teacherRepository.save(teacher);
	}

}
