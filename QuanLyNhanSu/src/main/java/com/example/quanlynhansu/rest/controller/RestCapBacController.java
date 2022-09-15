package com.example.quanlynhansu.rest.controller;

import com.example.quanlynhansu.entity.CapBac;
import com.example.quanlynhansu.service.impl.CapBacServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/cap-bacs")
public class RestCapBacController {
	@Autowired
	private CapBacServiceImpl capBacServiceImpl;
	
	@GetMapping()
	public List<CapBac> getAll(){
		return capBacServiceImpl.getAll();
	}
}
