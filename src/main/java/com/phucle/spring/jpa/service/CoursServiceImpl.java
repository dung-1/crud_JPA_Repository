package com.phucle.spring.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phucle.spring.jpa.entity.Cours;
import com.phucle.spring.jpa.repository.CoursRepository;


@Service
public class CoursServiceImpl implements BaseService<Cours> {
	
	@Autowired
	private CoursRepository coursRepository;

	@Override
	public List<Cours> getAll() {
		// TODO Auto-generated method stub
		return coursRepository.findAll();
	}

	@Override
	public void save(Cours object) {
		// TODO Auto-generated method stub
		coursRepository.save(object);
	}

	@Override
	public Cours getByID(int id) {
		// TODO Auto-generated method stub
		return coursRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		coursRepository.deleteById(id);
		
	}

	

}
