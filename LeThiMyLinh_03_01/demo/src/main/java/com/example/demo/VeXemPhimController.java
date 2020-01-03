package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RestController
public class VeXemPhimController {
	
	@Autowired
	VeXemPhimService service;
	//tạo api get all ThueXe
	
	@RequestMapping(value = "/getAllDataVeXemPhim")
	public List<VeXemPhim> getAllDataVeXemPhim(){
		return service.getAllDataVeXemPhim();
	} 
	@RequestMapping(value = "/insertOneVeXemPhim")
	public Boolean insertOneVeXemPhim(@RequestBody VeXemPhim veXem) {
		service.insertOneVeXemPhim(veXem);
		return true;
	}
	@RequestMapping(value = "/deleteOneVeXemPhim")
	public boolean deleteOneVeXemPhim(@RequestBody VeXemPhim xemphim) {
		 service.deleteOneVeXemPhim(xemphim.getMaVe());
		 return true;
	}
	@RequestMapping(value = "/editVeXemPhim")
	public boolean editVeXemPhim(@RequestBody VeXemPhim xemphim) {
		 service.editVeXemPhim(xemphim);
		 return true;
	}
	@RequestMapping(value = "/searchVeXemPhim")
	public List<VeXemPhim> searchVeXemPhim(@RequestParam(name = "tenPhim") String tenPhim,@RequestParam(name = "ngayChieu") String ngayChieu){
		System.out.println(tenPhim);
		System.out.println(ngayChieu);
		return service.searchVeXemPhim(tenPhim, ngayChieu);
	}
	@RequestMapping("/veXemPhim")
	public String get() {
		return "form";
	}
	@RequestMapping("/search")
	public String search(@RequestParam(name = "tenPhim") String tenPhim,@RequestParam(name = "ngayChieu") String ngayChieu, Model model){
		
		if (StringUtils.isEmpty(tenPhim) & StringUtils.isEmpty(ngayChieu) ) {
            return "redirect:/form";
        }
		
		model.addAttribute("xemphim", service.searchVeXemPhim(tenPhim, ngayChieu));
		return "xemphim";	
	}
}
