package com.sinfloo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbluser")

public class khachhang {
	@Id
	@Column
	public int id;
	@Column (name="taikhoan")
	public String taikhoan;
	@Column
	public String matkhau;
	@Column
	public String tenuser;
	@Column
	public String dob;
	@Column
	public String gioitinh;
	@Column
	public String diachi;
	@Column
	public int sdt;
	@Column
	public int quyen;
	@Column 
	public String anhdaidien;
	@Column(name="chieucao")
	public int chieucao;
	@Column(name="cannang")
	public int cannang;
	
	public khachhang() {
		
	}

	public int getId() {
		return id;
	}

	
	

	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTenuser() {
		return tenuser;
	}

	public void setTenuser(String tenuser) {
		this.tenuser = tenuser;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public int getQuyen() {
		return quyen;
	}

	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}

	public String getAnhdaidien() {
		return anhdaidien;
	}

	public void setAnhdaidien(String anhdaidien) {
		this.anhdaidien = anhdaidien;
	}

	public int getChieucao() {
		return chieucao;
	}

	public void setChieucao(int chieucao) {
		this.chieucao = chieucao;
	}

	public int getCannang() {
		return cannang;
	}

	public void setCannang(int cannang) {
		this.cannang = cannang;
	}

	public String toString() {
		return "" + this.id;
	}
	
}

