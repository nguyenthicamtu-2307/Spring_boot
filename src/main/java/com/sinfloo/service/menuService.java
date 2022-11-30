package com.sinfloo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.sinfloo.interfaces.khachhangInterface;
import com.sinfloo.interfaces.khachhangRespon;
import com.sinfloo.interfaces.menuInterface;
import com.sinfloo.modelo.khachhang;
import com.sinfloo.modelo.menu;
import com.sinfloo.modeloDAO.khachhangDAO;
import com.sinfloo.modeloDAO.menuDAO;

@Service
@Repository
public class menuService implements menuInterface{
	@Autowired 
	private khachhangRespon repositorys;
@Autowired
	menuDAO dao;
@Override
public List<Map<String, Object>> list() {
	return dao.list();
}
@Override
public List<Map<String, Object>> listarId(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int add(menu p) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int edit(menu p) {
	// TODO Auto-generated method stub
	return 0;
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
@Override
public List<Map<String, Object>> listall() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
