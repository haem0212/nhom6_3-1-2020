package com.thuexe.thuexe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="thuexe")
public class ThueXe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public Integer maXe;
	public String noiDi;
	public String noiDen;
	public String ngayDi;
	public String gioDi;
	public String gioDen;
	public int giaTien;
	public int soGhe;	
	public ThueXe() {
		super();
	}
	public ThueXe(Integer maXe, String noiDi, String noiDen, String ngayDi, String gioDi, String gioDen, int giaTien,
			int soGhe) {
		super();
		this.maXe = maXe;
		this.noiDi = noiDi;
		this.noiDen = noiDen;
		this.ngayDi = ngayDi;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.giaTien = giaTien;
		this.soGhe = soGhe;
	}
	public Integer getMaXe() {
		return maXe;
	}
	public void setMaXe(Integer maXe) {
		this.maXe = maXe;
	}
	public String getNoiDi() {
		return noiDi;
	}
	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public String getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}
	public String getGioDi() {
		return gioDi;
	}
	public void setGioDi(String gioDi) {
		this.gioDi = gioDi;
	}
	public String getGioDen() {
		return gioDen;
	}
	public void setGioDen(String gioDen) {
		this.gioDen = gioDen;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	
	
}
