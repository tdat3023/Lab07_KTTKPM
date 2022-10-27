
package com.example.qlchuyenbay.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qlchuyenbay.dao.ChuyenBayRepository;
import com.example.qlchuyenbay.dao.MayBayRepository;
import com.example.qlchuyenbay.dao.NhanVienRepository;
import com.example.qlchuyenbay.model.ChuyenBay;
import com.example.qlchuyenbay.model.MayBay;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	private NhanVienRepository nhanVienRepository;
	
	
	@Autowired
	public NhanVienServiceImpl(NhanVienRepository nhanVienRepository) {
		super();
		this.nhanVienRepository = nhanVienRepository;
	}


	@Override
	public Double getTotalLuong() {
		
		
		return nhanVienRepository.totalLuong();
	}


	


	

	
	

}
