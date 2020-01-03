package com.thuexe.thuexe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ThueXeController {
	@Autowired
	ThueXeService service;
	
//	a. Lấy các tất cả các thông tin của mã xe kèm thêm thời gian đi, biết rằng thời gian đi = giờ đến - giờ đi
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllDataThueXe")
	public List<ThueXeDTO> getAllThueXe(){
		return service.getAllThueXe();
	}
//	b. Tìm kiếm chuyến xe theo nơi đi, nơi đến và ngày đi
	@CrossOrigin(value = "*")
	@RequestMapping(value ="/getAllAdAndTime")
	public List<ThueXe> getAllAdAndTime(@RequestParam(name = "noiDi") String noiDi,
														@RequestParam(name = "noiDen") String noiDen,
														@RequestParam(name = "ngayDi") String ngayDi){
		return service.getAllAdAndTime(noiDi, noiDen, ngayDi);
	}
//	c. Xóa 1 chuyến xe theo mã 
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/deleteMaXe")
	public boolean deleteMaXe(@RequestBody ThueXe thuexe) {
		 service.deleteMaXe(thuexe.getMaXe());
		 return true;
	}
//	d. Xóa nhiều chuyến xe theo ngày
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/deleteByNgayDi")
	public boolean deleteByNgayDi(@RequestBody ThueXe thuexe) {
		 service.deleteByNgayDi(thuexe.getNgayDi());
		 return true;
	}
//	d. Chỉnh sửa 1 chuyến xe theo mã
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/updateThueXe")
	public boolean updateThueXe(@RequestBody ThueXe thuexe) {
		 service.updateThueXe(thuexe);
		 return true;	
	}
//	Sắp xếp chuyến xe tăng dần theo giá tiền
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllThueXeSortAscByGiaTien")
	public List<ThueXeDTO> getAllThueXeSortAscByGiaTien(){
		return service.getAllThueXeSortAscByGiaTien();
	}
//	Sắp xếp chuyến xe giảm dần theo giá tiền
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllThueXeSortDescByGiaTien")
	public List<ThueXeDTO> getAllThueXeSortDescByGiaTien(){
		return service.getAllThueXeSortDescByGiaTien();
	}
//	sắp xếp các chuyến xe theo chiều tăng dần của giờ đi
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllThueXeSortAscByGioDi")
	public List<ThueXeDTO> getAllThueXeSortAscByGioDi(){
		return service.getAllThueXeSortAscByGioDi();
	}
//	 sắp xếp các chuyến xe theo chiều giảm dần của giờ đi
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllThueXeSortDescByGioDi")
	public List<ThueXeDTO> getAllThueXeSortDescByGioDi(){
		return service.getAllThueXeSortDescByGioDi();
	}
}
