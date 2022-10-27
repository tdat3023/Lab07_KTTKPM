package com.example.qlchuyenbay.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.qlchuyenbay.model.ChuyenBay;
import com.example.qlchuyenbay.model.MayBay;
import com.example.qlchuyenbay.service.ChuyenBayService;
import com.example.qlchuyenbay.service.MayBayService;
import com.example.qlchuyenbay.service.NhanVienService;





@RestController
@RequestMapping("/api")
public class NhanVienController {
	private NhanVienService nhanVienDao;

	@Autowired
	public NhanVienController( NhanVienService nhanVienDao) {
		super();
		this.nhanVienDao = nhanVienDao;
	}


	@GetMapping("/nhanvien/totalsalary")
	public String getTotalLuong () {
		System.out.println(nhanVienDao.getTotalLuong());
		return "Total Salary: " + " " +  nhanVienDao.getTotalLuong() + "$";
		
	}
	@GetMapping("/hello")
	public String helloWorld () {
		//System.out.println(nhanVienDao.getTotalLuong());
		return "hello";
		
	}
	
	
	

	
}
