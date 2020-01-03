package com.thuexe.thuexe;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ThueXeService {
	@Autowired
	ThueXeDAO service;
	
//	a. Lấy các tất cả các thông tin của mã xe kèm thêm thời gian đi, biết rằng thời gian đi = giờ đến - giờ đi
	@Cacheable(value = "thuexe")
	public List<ThueXeDTO> getAllThueXe(){
		List<ThueXeDTO> thuexedto = new ArrayList<ThueXeDTO>();
		List<ThueXe> thuexe = service.findAll();
		for (ThueXe Xe : thuexe ) {
			ThueXeDTO dto = new ThueXeDTO();
			dto.setMaXe(Xe.getMaXe());
			dto.setNoiDi(Xe.getNoiDi());
			dto.setNoiDen(Xe.getNoiDen());
			dto.setNgayDi(Xe.getNgayDi());
			dto.setGioDi(Xe.getGioDi());
			dto.setGioDen(Xe.getGioDen());
			dto.setSoGhe(Xe.getSoGhe());
			dto.setGiaTien(Xe.getGiaTien());
			dto.setThoiGianDi(Integer.parseInt(Xe.getGioDen()) - Integer.parseInt(Xe.getGioDi())+"");
			thuexedto.add(dto);
		}
		return thuexedto;
	}
//	b. Tìm kiếm chuyến xe theo nơi đi, nơi đến và ngày đi
	public List<ThueXe> getAllAdAndTime(String noiDi, String noiDen, String ngayDi){
		ThueXe thuexe = new ThueXe();
		thuexe.setNoiDi(noiDi);
		thuexe.setNoiDen(noiDen);
		thuexe.setNgayDi(ngayDi);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maXe")
				.withIgnorePaths("gioDi")
				.withIgnorePaths("gioDen")
				.withIgnorePaths("giaTien")
				.withIgnorePaths("soGhe");
		return service.findAll(Example.of(thuexe,exampleMatcher));
	}
//	c. Xóa 1 chuyến xe theo mã 
	public void deleteMaXe(Integer maXe) {
		service.deleteById(maXe);
	}
//	d. Xóa nhiều chuyến xe theo ngày
	public void deleteByNgayDi(String ngayDi) {
		ThueXe thuexe = new ThueXe();
		thuexe.setNgayDi(ngayDi);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maXe")
				.withIgnorePaths("noiDi")
				.withIgnorePaths("noiDen")
				.withIgnorePaths("gioDi")
				.withIgnorePaths("gioDen")
				.withIgnorePaths("giaTien")
				.withIgnorePaths("soGhe");
		
		List<ThueXe> thuexes = service.findAll(Example.of(thuexe, exampleMatcher));
		
		service.deleteAll(thuexes);
	}
//	d. Chỉnh sửa 1 chuyến xe theo mã
	public void updateThueXe(ThueXe thuexe) {
		service.save(thuexe);
	}
//	Sắp xếp chuyến xe tăng dần theo giá tiền
	public List<ThueXeDTO> getAllThueXeSortAscByGiaTien(){
		List<ThueXeDTO> thuexedto = new ArrayList<ThueXeDTO>();
		List<ThueXe> thuexe = service.findAll(Sort.by("giaTien").ascending());
		for (ThueXe Xe : thuexe ) {
			ThueXeDTO dto = new ThueXeDTO();
			dto.setMaXe(Xe.getMaXe());
			dto.setNoiDi(Xe.getNoiDi());
			dto.setNoiDen(Xe.getNoiDen());
			dto.setNgayDi(Xe.getNgayDi());
			dto.setGioDi(Xe.getGioDi());
			dto.setGioDen(Xe.getGioDen());
			dto.setSoGhe(Xe.getSoGhe());
			dto.setGiaTien(Xe.getGiaTien());
			dto.setThoiGianDi(Integer.parseInt(Xe.getGioDen()) - Integer.parseInt(Xe.getGioDi())+"");
			thuexedto.add(dto);
		}
		return thuexedto;
	}
//	Sắp xếp chuyến xe giảm dần theo giá tiền
	public List<ThueXeDTO> getAllThueXeSortDescByGiaTien(){
		List<ThueXeDTO> thuexedto = new ArrayList<ThueXeDTO>();
		List<ThueXe> thuexe = service.findAll(Sort.by("giaTien").descending());
		for (ThueXe Xe : thuexe ) {
			ThueXeDTO dto = new ThueXeDTO();
			dto.setMaXe(Xe.getMaXe());
			dto.setNoiDi(Xe.getNoiDi());
			dto.setNoiDen(Xe.getNoiDen());
			dto.setNgayDi(Xe.getNgayDi());
			dto.setGioDi(Xe.getGioDi());
			dto.setGioDen(Xe.getGioDen());
			dto.setSoGhe(Xe.getSoGhe());
			dto.setGiaTien(Xe.getGiaTien());
			dto.setThoiGianDi(Integer.parseInt(Xe.getGioDen()) - Integer.parseInt(Xe.getGioDi())+"");
			thuexedto.add(dto);
		}
		return thuexedto;
	}
//	sắp xếp các chuyến xe theo chiều tăng dần của giờ đi
	public List<ThueXeDTO> getAllThueXeSortAscByGioDi(){
		List<ThueXeDTO> thuexedto = new ArrayList<ThueXeDTO>();
		List<ThueXe> thuexe = service.findAll(Sort.by("gioDi").ascending());
		for (ThueXe Xe : thuexe ) {
			ThueXeDTO dto = new ThueXeDTO();
			dto.setMaXe(Xe.getMaXe());
			dto.setNoiDi(Xe.getNoiDi());
			dto.setNoiDen(Xe.getNoiDen());
			dto.setNgayDi(Xe.getNgayDi());
			dto.setGioDi(Xe.getGioDi());
			dto.setGioDen(Xe.getGioDen());
			dto.setSoGhe(Xe.getSoGhe());
			dto.setGiaTien(Xe.getGiaTien());
			dto.setThoiGianDi(Integer.parseInt(Xe.getGioDen()) - Integer.parseInt(Xe.getGioDi())+"");
			thuexedto.add(dto);
		}
		return thuexedto;
	}
//	 sắp xếp các chuyến xe theo chiều giảm dần của giờ đi
	public List<ThueXeDTO> getAllThueXeSortDescByGioDi(){
		List<ThueXeDTO> thuexedto = new ArrayList<ThueXeDTO>();
		List<ThueXe> thuexe = service.findAll(Sort.by("gioDi").descending());
		for (ThueXe Xe : thuexe ) {
			ThueXeDTO dto = new ThueXeDTO();
			dto.setMaXe(Xe.getMaXe());
			dto.setNoiDi(Xe.getNoiDi());
			dto.setNoiDen(Xe.getNoiDen());
			dto.setNgayDi(Xe.getNgayDi());
			dto.setGioDi(Xe.getGioDi());
			dto.setGioDen(Xe.getGioDen());
			dto.setSoGhe(Xe.getSoGhe());
			dto.setGiaTien(Xe.getGiaTien());
			dto.setThoiGianDi(Integer.parseInt(Xe.getGioDen()) - Integer.parseInt(Xe.getGioDi())+"");
			thuexedto.add(dto);
		}
		return thuexedto;
	}
}
