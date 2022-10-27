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





@RestController
@RequestMapping("/api")
public class MayBayController {
	private MayBayService mayBayDao;

	@Autowired
	public MayBayController( MayBayService mayBayDao) {
		super();
		this.mayBayDao = mayBayDao;
	}


	@GetMapping("/maybay/greaterthan")
	public List<MayBay> getMayBayByTamBay (@RequestParam int tamBay) {
		System.out.println(tamBay);
		return mayBayDao.findByTamBayGreaterThan(tamBay);
		
	}
	
	@GetMapping("/maybay/loaicontains")
	public List<MayBay> getMayBayByLoai (@RequestParam String loai) {
		System.out.println(loai);
		
		return mayBayDao.findByLoaiContaining(loai);
		
	}

	

	
}
