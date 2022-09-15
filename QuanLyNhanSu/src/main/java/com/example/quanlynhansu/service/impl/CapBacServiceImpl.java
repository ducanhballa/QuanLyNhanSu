package com.example.quanlynhansu.service.impl;

import com.example.quanlynhansu.entity.CapBac;
import com.example.quanlynhansu.repository.CapBacRepository;
import com.example.quanlynhansu.service.ICapBacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CapBacServiceImpl implements ICapBacService{
	@Autowired
	private CapBacRepository capBacRepository;
	@Override
	public List<CapBac> getAll() {
		return capBacRepository.findAll();
	}

}
