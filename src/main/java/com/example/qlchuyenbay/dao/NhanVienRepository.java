package com.example.qlchuyenbay.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.qlchuyenbay.model.ChuyenBay;
import com.example.qlchuyenbay.model.MayBay;
import com.example.qlchuyenbay.model.NhanVien;

public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
	@Query(value = "SELECT SUM(luong) AS Total FROM nhanvien;", nativeQuery = true)
	Double totalLuong();

}

