package com.example.Giuxe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.example.Giuxe.GiuxeDAO;

@Service
public class GiuxeService {
	@Autowired
	GiuxeDAO dao;
	//a. liệt kê tất cả các thông tin của thực thể
		public List<Giuxe> getAllXe(){
			return dao.findAll();
		}
	//b. thêm mới 1 thực thể
	public void insertOne(Giuxe music) {
		dao.save(music);
	}
	//c. xóa 1 thực thể
		public void delonebyMusic(Integer maXe) {
			Giuxe giuxe = new Giuxe();
			giuxe.setMaXe(maXe);
			ExampleMatcher exampleMatcher = ExampleMatcher.matching()
					.withIgnorePaths("tenBH")
					.withIgnorePaths("caSi")
					.withIgnorePaths("tacGia")
					.withIgnorePaths("theLoai")
					.withIgnorePaths("ngayDien")
					.withIgnorePaths("noiDien")
					.withIgnorePaths("giaVe");
			
			List<Giuxe> giuxex = dao.findAll(Example.of(giuxe,exampleMatcher));
			
			//delete
			dao.deleteAll(giuxex);
		}
		//d. chỉnh sửa 1 thực thể
		public void update(Giuxe giuxe) {
			dao.save(giuxe);
		}
		//e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
		public List<Giuxe> searchBytenBHAndCasi(String tenXe, String tenchu){
			Giuxe giuxe = new Giuxe();
			giuxe.setTenXe(tenXe);;
			giuxe.setTenchu(tenchu);;
			ExampleMatcher exampleMatcher = ExampleMatcher.matching()
					.withIgnorePaths("tenXe")
					.withIgnorePaths("bienso");
			return dao.findAll(Example.of(giuxe,exampleMatcher));
		}
}
