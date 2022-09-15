package com.example.quanlynhansu.entity;

import javax.persistence.*;

@Table(name = "capbac")
@Entity
public class CapBac {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tenCB")
	private String tenCB;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTenCB() {
		return tenCB;
	}
	public void setTenCB(String tenCB) {
		this.tenCB = tenCB;
	}
	
}
