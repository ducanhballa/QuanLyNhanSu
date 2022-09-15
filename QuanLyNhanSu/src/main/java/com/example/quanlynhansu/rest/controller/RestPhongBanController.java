package com.example.quanlynhansu.rest.controller;

import com.example.quanlynhansu.entity.PhongBan;
import com.example.quanlynhansu.service.impl.PhongBanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/phong-bans")
public class RestPhongBanController {
	@Autowired
	private PhongBanServiceImpl phongBanServiceImpl;
	@GetMapping()
	public List<PhongBan> getAll(){
		return phongBanServiceImpl.getAll();
	}
}
