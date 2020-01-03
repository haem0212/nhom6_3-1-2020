package com.Music.Music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MusicService {
	@Autowired
	MusicDAO dao;
	
	//a. liệt kê tất cả các thông tin của thực thể
	public List<Music> getAllMusic(){
		return dao.findAll();
	}
	//b. thêm mới 1 thực thể
	public void insertOne(Music music) {
		dao.save(music);
	}
	//c. xóa 1 thực thể
	public void delonebyMusic(Integer maBH) {
		Music music = new Music();
		music.setMaBH(maBH);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("tenBH")
				.withIgnorePaths("caSi")
				.withIgnorePaths("tacGia")
				.withIgnorePaths("theLoai")
				.withIgnorePaths("ngayDien")
				.withIgnorePaths("noiDien")
				.withIgnorePaths("giaVe");
		
		List<Music> musics = dao.findAll(Example.of(music,exampleMatcher));
		
		//delete
		dao.deleteAll(musics);
	}
	//d. chỉnh sửa 1 thực thể
	public void update(Music music) {
		dao.save(music);
	}
	//e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	public List<Music> searchBytenBHAndCasi(String caSi, String tacGia){
		Music music = new Music();
		music.setCaSi(caSi);
		music.setTacGia(tacGia);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("maBH")
				.withIgnorePaths("tenBh")
				.withIgnorePaths("theLoai")
				.withIgnorePaths("ngayDien")
				.withIgnorePaths("noiDien")
				.withIgnorePaths("giaVe");
		return dao.findAll(Example.of(music,exampleMatcher));
	}
}
