
package com.example.qlchuyenbay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qlchuyenbay.dao.ChungNhanRepository;
import com.example.qlchuyenbay.dao.ChuyenBayRepository;
import com.example.qlchuyenbay.model.ChungNhan;
import com.example.qlchuyenbay.model.ChuyenBay;

@Service
public class ChungNhanServiceImpl implements ChungNhanService {
	private ChungNhanRepository chungNhanRepository;
	
	
	@Autowired
	public ChungNhanServiceImpl(ChungNhanRepository chungNhanRepository) {
		super();
		this.chungNhanRepository = chungNhanRepository;
	}


	@Override
	public List<String> findMaNhanVienByMayBay(String loaiMayBay) {
		List<String> result = chungNhanRepository.findMaNhanVienByMayBay(loaiMayBay);
		System.out.println("result"  + result);
		
		return result;
	}





	

}
