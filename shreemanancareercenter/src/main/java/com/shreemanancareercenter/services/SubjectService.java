package com.shreemanancareercenter.services;

import java.util.List;

import com.shreemanancareercenter.entity.Subject;

public interface SubjectService {
	
	public void addSubject(Subject subject);
	
	public Subject getSubjectBySubjectId(int subjectId);
	
	public List<Subject> getAllSubjectByCourseName();
	
	public List<Subject> getAllSubjects();

}
