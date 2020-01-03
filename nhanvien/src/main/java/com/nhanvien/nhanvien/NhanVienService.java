package com.nhanvien.nhanvien;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
	@Autowired
	NhanVienDAO service;
	
//	a. liệt kê tất cả các thông tin của thực thể
	public List<NhanVien> getAllDataNhanVien(){
		return service.findAll();
	}
//	b. thêm mới 1 thực thể
	public void insertOneNhanVien(NhanVien nhanvien) {
		service.save(nhanvien);
	}
//	c. xóa 1 thực thể
	public void deleteOneNhanVien(Integer maNV) {
		service.deleteById(maNV);
	}
//	d. chỉnh sửa 1 thực thể
	public void updateOneNhanVien(NhanVien nhanvien) {
		service.save(nhanvien);
	}
//	e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	public List<NhanVien> getAllDataNhanVienByNameAndAddress(String tenNV,String diaChi){
		NhanVien nhanvien = new  NhanVien();
		nhanvien.setTenNV(tenNV);
		nhanvien.setDiaChi(diaChi);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maNV")
				.withIgnorePaths("gioiTinh")
				.withIgnorePaths("ngaySinh")
				.withIgnorePaths("email")
				.withIgnorePaths("chucVu");
		return service.findAll(Example.of(nhanvien,exampleMatcher));
	}
}
