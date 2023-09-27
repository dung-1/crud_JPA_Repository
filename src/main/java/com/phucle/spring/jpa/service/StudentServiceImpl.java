package com.phucle.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phucle.spring.jpa.entity.Student;
import com.phucle.spring.jpa.repository.StudentRepository;

@Service
public class StudentServiceImpl implements BaseService<Student> {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public void save(Student object) {
		studentRepository.save(object);
		
	}

	@Override
	public Student getByID(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

}
