package com.example.quanlynhansu.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "nhanvien")
@Entity
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "manv")
	private String maNV;
	@Column(name = "tennv")
	private String tenNV;
	@Column(name = "ngaysinh")
	private Date ngaySinh;
	@Column(name = "ngayvl")
	private Date ngayVL;
	@ManyToOne
	@JoinColumn(name = "phongbanid")
	private PhongBan phongBan;
	@ManyToOne
	@JoinColumn(name = "capbacid")
	private CapBac capBac;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Date getNgayVL() {
		return ngayVL;
	}
	public void setNgayVL(Date ngayVL) {
		this.ngayVL = ngayVL;
	}
	public PhongBan getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}
	public CapBac getCapBac() {
		return capBac;
	}
	public void setCapBac(CapBac capBac) {
		this.capBac = capBac;
	}
	
	
}
