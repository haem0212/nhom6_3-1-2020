package com.train.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class trainService {
@Autowired
trainDao service;

//1a select all data
public List<train> getalltrain(){
	return service.findAll();
}
//1b. Insert vetau
	public void inserttrain(List<train> train) {
		 service.saveAll(train);
	}
//1c. Delete One

	public void deleteOnevetau(Integer mave) {
	service.deleteById(mave);
	}
//1d. update one
	public void updatevetau(train train) {
		service.save(train);
	}
//1e. tìm kiếm
	public List<train> getAllBymavematau(Integer mave, int soghe){
		train train = new train();
		train.setMave(mave);
		train.setSoghe(soghe);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("matau")
				.withIgnorePaths("ngaydi")
				.withIgnorePaths("ngayden")
				.withIgnorePaths("giodi")
				.withIgnorePaths("gioden")
				.withIgnorePaths("price");
		return service.findAll(Example.of(train,exampleMatcher));
	}
}
