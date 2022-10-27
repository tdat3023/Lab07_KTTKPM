package com.example.qlchuyenbay.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaMB")
	private int maMB;
	
	@Column(name = "Loai")
	private String loai;
	
	@Column(name = "TamBay")
	private int tamBay;
	
	
	
	public MayBay(int maMB, String loai, int tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}
	public MayBay() {
		super();
	}
	public int getMaMB() {
		return maMB;
	}
	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTamBay() {
		return tamBay;
	}
	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}
	
	
	
	
}
