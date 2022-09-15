package com.example.quanlynhansu.service.impl;

import com.example.quanlynhansu.entity.PhongBan;
import com.example.quanlynhansu.repository.PhongBanRepository;
import com.example.quanlynhansu.service.IPhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongBanServiceImpl implements IPhongBanService{
	@Autowired
	private PhongBanRepository phongBanRepository;
	@Override
	public List<PhongBan> getAll() {
		return phongBanRepository.findAll();
	}

}
