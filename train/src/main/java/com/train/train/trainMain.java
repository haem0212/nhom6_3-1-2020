package com.train.train;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trainMain {
@Autowired
trainService service;

//1a select all data
@CrossOrigin(value = "*")
@RequestMapping(value="/getalltrain")
public List<train> getallvetau(){
	return service.getalltrain();
}
//1b.insert many vetau
	@CrossOrigin(value = "*")
	@RequestMapping(value="/insertvetau")
	public boolean inservetau(@RequestBody List<train> train) {
		service.inserttrain(train);
		return true;
	}
//1c.del
	@CrossOrigin(value = "*")
	@RequestMapping(value="/delOne")
	public boolean deleteOnethuexe(@RequestBody train train) {
		service.deleteOnevetau(train.getMave());
		return true;
	}
//1d.update
	@CrossOrigin(value = "*")
	@RequestMapping(value="/update")
	public boolean updateOnethuexe(@RequestBody train train) {
		service.updatevetau(train);
		return true;
	}
//1e. tìm kiếm
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/search")
	public List<train> getallmavevetau(@RequestParam(name="mave") Integer mave,
									@RequestParam(name="soghe") int  soghe){

	return service.getAllBymavematau(mave, soghe);
	}
}
