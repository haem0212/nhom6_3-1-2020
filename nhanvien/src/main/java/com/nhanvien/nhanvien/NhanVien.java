package com.nhanvien.nhanvien;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public Integer maNV;
	public String tenNV;
	public String gioiTinh;
	public String ngaySinh;
	public String diaChi;
	public String email;
	public String chucVu;
	
	public NhanVien() {
		super();
	}
	public NhanVien(Integer maNV, String tenNV, String gioiTinh, String ngaySinh, String diaChi, String email,
			String chucVu) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.email = email;
		this.chucVu = chucVu;
	}
	public Integer getMaNV() {
		return maNV;
	}
	public void setMaNV(Integer maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	
}
