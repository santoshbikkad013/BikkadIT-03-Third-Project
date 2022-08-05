package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Student;
import com.example.demo.reposoitory.StudentRepository;

public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public int addStudent(Student student) {
		Student save = studentRepository.save(student);
		
		return save.getStudentId();
	}

	@Override
	public List<Student> getAllStudent() {
	 List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student findById = studentRepository.findById(id).get();
		return findById;
	}

}
