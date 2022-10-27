package com.example.qlchuyenbay.service;

import java.util.List;

import com.example.qlchuyenbay.model.MayBay;

public interface MayBayService {
	List<MayBay> findByTamBayGreaterThan(int tamBay);
	List<MayBay> findByLoaiContaining(String loai);
}
