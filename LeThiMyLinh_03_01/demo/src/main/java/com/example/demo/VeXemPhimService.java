package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class VeXemPhimService {
	
	@Autowired
	VeXemPhimDAO service;
	
		//@Cacheable(value = "thuexe")
		public List<VeXemPhim> getAllDataVeXemPhim(){
			return service.findAll();
		}
		public void insertOneVeXemPhim(VeXemPhim vexem) {
			service.save(vexem);
		}
		public void deleteOneVeXemPhim(int maVe) {
			service.deleteById(maVe);
		}
		public void editVeXemPhim(VeXemPhim xemphim) {
			service.save(xemphim);
		}
		public List<VeXemPhim> searchVeXemPhim(String tenPhim, String ngayChieu){
			VeXemPhim xemphim = new VeXemPhim();
			xemphim.setTenPhim(tenPhim);
			xemphim.setNgayChieu(ngayChieu);
			ExampleMatcher examplematcher =  ExampleMatcher.matching()
			.withIgnorePaths("maVe")
			.withIgnorePaths("soRap")
			.withIgnorePaths("soGhe")
			.withIgnorePaths("gioChieu");
			return service.findAll(Example.of(xemphim,examplematcher));
		
		}
}
