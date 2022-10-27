package com.example.qlchuyenbay.service;

import java.util.List;

import com.example.qlchuyenbay.model.ChungNhan;

public interface ChungNhanService {
	//Cho biết mã số của các phi công lái máy báy Boeing
		List<String> findMaNhanVienByMayBay(String loaiMayBay);
}
