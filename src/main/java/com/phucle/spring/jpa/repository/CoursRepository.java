package com.phucle.spring.jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.phucle.spring.jpa.entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
