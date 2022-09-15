package com.example.quanlynhansu.service;

import com.example.quanlynhansu.entity.NhanVien;

import java.util.List;

public interface INhanVienService {
	List<NhanVien> getAll();
	NhanVien create(NhanVien nv);
	NhanVien update (NhanVien nv);
	void delete(Integer id);
}
