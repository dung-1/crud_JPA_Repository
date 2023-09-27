package com.phucle.spring.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucle.spring.jpa.entity.Student;
import com.phucle.spring.jpa.entity.Cours;



@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findAllByCours(Cours cours); 
	
}
