package com.phucle.spring.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="hoTen")
	private String hoten;
	
	@Column(name="ngaySinh")
	private String lastName;
	
	@Column(name="diaChi")
	private String diaChi;
	
	@Column(name="cccd")
	private String cccd;

	@Column(name="gioiTinh")
	private String gioiTinh;

	@Column(name="queQuan")
	private String queQuan;
	
	@ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
	
	
	



	/**
	 * @return the province
	 */


	/**
	 * @return the hobbies
	 */

	
	
}





