package com.spring.aop.services;

import com.spring.aop.dto.Student;
import com.spring.aop.dto.Teacher;

public class AopService {
	private Student student;
	private Teacher teacher;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
