package com.shreemanancareercenter.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.entity.Subject;
import com.shreemanancareercenter.repository.SubjectRepository;
import com.shreemanancareercenter.services.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectRepository subjectRepository;
	
	@Override
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	@Override
	public Subject getSubjectBySubjectId(int subjectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getAllSubjectByCourseName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
