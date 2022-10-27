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
import com.example.qlchuyenbay.service.ChungNhanService;
import com.example.qlchuyenbay.service.ChuyenBayService;





@RestController
@RequestMapping("/api")
public class ChungNhanController {
	private ChungNhanService chungNhanDao;

	@Autowired
	public ChungNhanController( ChungNhanService chungNhanDao) {
		super();
		this.chungNhanDao = chungNhanDao;
	}

	//Get: MaNV by LoaiMayBay
	@GetMapping("/nhanvien")
	public List<String> getMayBayByTamBay (@RequestParam String loaiMayBay) {
		System.out.println(loaiMayBay);
		return chungNhanDao.findMaNhanVienByMayBay(loaiMayBay);
		
	}
	

}
