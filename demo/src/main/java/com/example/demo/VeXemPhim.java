package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VeXemPhim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer maVe;
	public String soRap;
	public String soGhe;
	public String tenPhim;
	public String gioChieu;
	public String ngayChieu;
	
	public VeXemPhim() {
		super();
	}
	public VeXemPhim(Integer maVe, String soRap, String soGhe, String tenPhim, String gioChieu, String ngayChieu) {
		super();
		this.maVe = maVe;
		this.soRap = soRap;
		this.soGhe = soGhe;
		this.tenPhim = tenPhim;
		this.gioChieu = gioChieu;
		this.ngayChieu = ngayChieu;
	}
	public Integer getMaVe() {
		return maVe;
	}
	public void setMaVe(Integer maVe) {
		this.maVe = maVe;
	}
	public String getSoRap() {
		return soRap;
	}
	public void setSoRap(String soRap) {
		this.soRap = soRap;
	}
	public String getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(String soGhe) {
		this.soGhe = soGhe;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getGioChieu() {
		return gioChieu;
	}
	public void setGioChieu(String gioChieu) {
		this.gioChieu = gioChieu;
	}
	public String getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(String ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	
}
	
	