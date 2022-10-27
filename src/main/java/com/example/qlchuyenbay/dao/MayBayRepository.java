package com.example.qlchuyenbay.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qlchuyenbay.model.ChuyenBay;
import com.example.qlchuyenbay.model.MayBay;

public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	List<MayBay> findByTamBayGreaterThan(int tamBay);
	List<MayBay> findByLoaiContaining(String loai);

	
	
}
