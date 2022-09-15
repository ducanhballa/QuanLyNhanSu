package com.example.quanlynhansu.entity;

import javax.persistence.*;

@Table(name = "phongban")
@Entity
public class PhongBan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tenpb")
	private String tenPB;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTenPB() {
		return tenPB;
	}
	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}
	
	
}
