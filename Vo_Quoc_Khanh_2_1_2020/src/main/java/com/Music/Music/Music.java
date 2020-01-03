package com.Music.Music;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Music")
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer maBH;
	public String tenBH;
	public String caSi;
	public String tacGia;
	public String theLoai;
	public String ngayDien;
	public String noiDien;
	public Integer giaVe;
	
	public Music() {
		super();
	}
	
	public Music(int maBH, String tenBH, String caSi, String tacGia, String theLoai, String ngayDien, String noiDien, Integer giaVe) {
		super();
		this.maBH = maBH;
		this.tenBH = tenBH;
		this.caSi = caSi;
		this.tacGia = tacGia;
		this.theLoai = theLoai;
		this.ngayDien = ngayDien;
		this.noiDien = noiDien;
		this.giaVe = giaVe;
	}

	public int getMaBH() {
		return maBH;
	}
	public void setMaBH(int maBH) {
		this.maBH = maBH;
	}
	public String getTenBH() {
		return tenBH;
	}
	public void setTenBH(String tenBH) {
		this.tenBH = tenBH;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getNgayDien() {
		return ngayDien;
	}
	public void setNgayDien(String ngayDien) {
		this.ngayDien = ngayDien;
	}
	public String getNoiDien() {
		return noiDien;
	}
	public void setNoiDien(String noiDien) {
		this.noiDien = noiDien;
	}
	public int getGiaVe() {
		return giaVe;
	}
	public void setGiaVE(int giaVe) {
		this.giaVe = giaVe;
	}
	
}
