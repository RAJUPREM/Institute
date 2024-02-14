package com.shreemanancareercenter.entity;

import jakarta.persistence.*;

@Entity
public class Subject {
	
	public Subject() {
		super();
	}
	public Subject(int subjectId, String subjectName) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int subjectId;
	private String subjectName;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}
	
	
}
