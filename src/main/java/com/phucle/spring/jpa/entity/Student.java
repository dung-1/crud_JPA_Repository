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
	private String hoTen;
	
	@Column(name="ngaySinh")
	private String ngaySinh;
	
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

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int id, String hoTen, String ngaySinh, String diaChi, String cccd, String gioiTinh, String queQuan,
			Cours cours) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.cccd = cccd;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.cours = cours;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	


	
	
}





