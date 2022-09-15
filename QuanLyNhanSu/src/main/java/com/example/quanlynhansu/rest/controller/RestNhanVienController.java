package com.example.quanlynhansu.rest.controller;

import com.example.quanlynhansu.entity.NhanVien;
import com.example.quanlynhansu.service.impl.NhanVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/nhan-viens")
public class RestNhanVienController {
	@Autowired
	private NhanVienServiceImpl nhanVienServiceImpl;
	@GetMapping()
	public List<NhanVien> getAll(){
		return nhanVienServiceImpl.getAll();
	}
	
	@PostMapping()
	public NhanVien createNhanVien(@RequestBody NhanVien nv) {
		return nhanVienServiceImpl.create(nv);
	}
	
	@PutMapping("{id}")
	public NhanVien update(@PathVariable Integer id, @RequestBody NhanVien nv) {
		return nhanVienServiceImpl.update(nv);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		 nhanVienServiceImpl.delete(id);
	}
}
