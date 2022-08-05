package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentServiceI {

	
	public int addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
}
