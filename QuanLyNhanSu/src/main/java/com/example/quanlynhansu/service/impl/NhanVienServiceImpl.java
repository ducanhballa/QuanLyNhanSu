package com.example.quanlynhansu.service.impl;

import com.example.quanlynhansu.entity.NhanVien;
import com.example.quanlynhansu.repository.NhanVienRepository;
import com.example.quanlynhansu.service.INhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements INhanVienService{
	@Autowired
	private NhanVienRepository nhanVienRepository;
	@Override
	public List<NhanVien> getAll() {
		return nhanVienRepository.findAll();
	}
	@Override
	public NhanVien create(NhanVien nv) {
		return nhanVienRepository.save(nv);
	}
	@Override
	public NhanVien update(NhanVien nv) {
		return nhanVienRepository.save(nv);
	}
	@Override
	public void delete(Integer id) {
		nhanVienRepository.deleteById(id);
		
	}

}
