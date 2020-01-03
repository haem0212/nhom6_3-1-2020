package com.Music.Music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/music")
public class MusicController {
	@Autowired
	MusicService service;
	
	//a. liệt kê tất cả các thông tin của thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getall")
	public List<Music> getAllMusic(){
		return service.getAllMusic();
	}
	//b. thêm mới 1 thực thể
	@RequestMapping(value = "/insertOne")
	public boolean insertOne(@RequestBody Music music) {
		service.insertOne(music);
		return true;	
	}
	//c. xóa 1 thực thể
	@RequestMapping(value="/delbymabh")
	public boolean delbymamabh(@RequestBody Music music) {
		service.delonebyMusic(music.getMaBH());
		return true;
	}
	//d. chỉnh sửa 1 thực thể
	@RequestMapping(value = "/update")
	public boolean update(@RequestBody Music music) {
		service.update(music);
		return true;
	}
	//e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/search")
	public List<Music> searchBytenBHAndCasi(@RequestParam(name = "caSi") String caSi,
											@RequestParam(name = "tacGia") String tacGia){
		return service.searchBytenBHAndCasi(tacGia, caSi);
	}
}
