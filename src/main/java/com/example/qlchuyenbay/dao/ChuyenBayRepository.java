package com.example.qlchuyenbay.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qlchuyenbay.model.ChuyenBay;


public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, Integer> {
	List<ChuyenBay> findByGaDen(String gaDen);
	List<ChuyenBay> findByDoDaiBetween(int startDoDai, int endDoDai);
	
	List<ChuyenBay> findByGaDiAndGaDen(String gaDi,  String gaDen);
	
	
	
}
