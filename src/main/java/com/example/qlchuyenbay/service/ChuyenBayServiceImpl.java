package com.example.qlchuyenbay.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.qlchuyenbay.dao.ChuyenBayRepository;
import com.example.qlchuyenbay.model.ChuyenBay;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	private ChuyenBayRepository chuyenBayRepository;
	
	
	@Autowired
	public ChuyenBayServiceImpl(ChuyenBayRepository chuyenBayRepository) {
		super();
		this.chuyenBayRepository = chuyenBayRepository;
	}


	@Override
	public List<ChuyenBay> getChuyenBayByDiemDen(String gaDen) {
		List<ChuyenBay> result = chuyenBayRepository.findByGaDen(gaDen);
		System.out.println("result"  + result);
		
		return result;
	}


	@Override
	public List<ChuyenBay> findByDoDaiBetween(int startDoDai, int endDoDai) {
		List<ChuyenBay> result = chuyenBayRepository.findByDoDaiBetween(startDoDai, endDoDai);
		System.out.println("result"  + result);
		return result;
	}
	
	@Override
	public List<ChuyenBay> findByGaDiAndGaDen(String gaDi,  String gaDen){
		List<ChuyenBay> result = chuyenBayRepository.findByGaDiAndGaDen(gaDi, gaDen);
		System.out.println("result"  + result);
		return result;
	}


	
	

}
