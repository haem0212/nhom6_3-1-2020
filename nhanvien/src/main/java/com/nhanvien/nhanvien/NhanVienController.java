package com.nhanvien.nhanvien;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NhanVienController {
	@Autowired
	NhanVienService service;
//	a. liệt kê tất cả các thông tin của thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value ="/getAllDataNhanVien")
	public List<NhanVien> getAllDataNhanVien(){
		return service.getAllDataNhanVien();
	}
//	b. thêm mới 1 thực thể
	@RequestMapping(value = "/insertOneNhanVien")
	public boolean insertOneNhanVien(@RequestBody NhanVien nhanvien) {
		service.insertOneNhanVien(nhanvien);
		return true;
	}
//	c. xóa 1 thực thể
	@RequestMapping(value = "/deleteOneNhanVien")
	public boolean deleteOneNhanVien(@RequestBody NhanVien nhanvien) {
		 service.deleteOneNhanVien(nhanvien.getMaNV());
		 return true;
	}
//	d. chỉnh sửa 1 thực thể
	@RequestMapping(value = "/updateOneNhanVien")
	public boolean updateOneNhanVien(@RequestBody NhanVien nhanvien) {
		service.updateOneNhanVien(nhanvien);
		return true;
	}
//	e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	@CrossOrigin(value = "*")
	@RequestMapping(value ="/getAllDataNhanVienByNameAndAddress")
	public List<NhanVien> getAllDataNhanVienByNameAndAddress(@RequestParam(name = "tenNV") String tenNV,
														@RequestParam(name = "diaChi") String diaChi){
		return service.getAllDataNhanVienByNameAndAddress(tenNV, diaChi);
	}
}
