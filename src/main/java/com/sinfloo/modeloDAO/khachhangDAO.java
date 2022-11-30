package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.khachhangInterface;
import com.sinfloo.modelo.khachhang;

@Service
public class khachhangDAO implements khachhangInterface {
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String, Object>> list = template.queryForList("select * from tbluser");
		return list;
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(khachhang p) {
		String sql = "insert into tbluser(tenuser, dob, gioitinh, diachi, sdt, taikhoan, matkhau,chieucao,cannang)values(?,?,?,?,?,?,?,?,?)";
		return template.update(sql, p.getTenuser(), p.getDob(), p.getGioitinh(), p.getDiachi(),p.getSdt(),p.getTaikhoan(),p.getMatkhau(),p.getChieucao(),p.getCannang());
	}

	@Override
	public int edit(khachhang p) {
		String sql="update tbluser set tenuser=?,dob=?,gioitinh=?,diachi=?,sdt=?,matkhau=?,chieucao=?,cannang=? where taikhoan=?";		
		return template.update(sql,p.getTenuser(), p.getDob(), p.getGioitinh(),p.getDiachi(),p.getSdt(),p.getMatkhau(),p.getChieucao(),p.getCannang(),p.getTaikhoan());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> getLogin() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int edit(khachhang p) {
//		String sql="update khachhang set tenkh=?,gioitinh=?,ngaysinh=?,sdt=?,idpx=?,diachi=?,email=?,taikhoan=?,matkhau=? where idkh=?";		
//		return template.update(sql,p.getTenkh(), p.getGioitinh(),p.getNgaysinh(),p.getSdt(),p.getIdPX(),p.getDiachi(),p.getEmail(),p.getTaikhoan(),p.getMatkhau(),p.getIdkh());
//	}
//
//	@Override
//	public int delete(int id) {
//		String sql="delete from khachhang where idkh=?";
//		return template.update(sql,id);
//	}
//
//	@Override
//	public List<Map<String, Object>> getLogin() {
//		List<Map<String,Object>> list = template.queryForList("select taikhoan,matkhau from khachhang");
//		return list;
//	}
}
