package com.phucle.spring.jpa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cours")
public class Cours {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="nienKhoa")
	private String nienKhoa;
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@OneToMany(mappedBy = "cours")
    private List<Student> students;




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Cours(int id, String name, String nienKhoa, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.nienKhoa = nienKhoa;
		this.students = students;
	}


	public String getNienKhoa() {
		return nienKhoa;
	}


	public void setNienKhoa(String nienKhoa) {
		this.nienKhoa = nienKhoa;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	
	

}
