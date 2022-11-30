package com.sinfloo.interfaces;

import java.util.List;
import java.util.Map;

import com.sinfloo.modelo.khachhang;
import com.sinfloo.modelo.menu;

public interface menuInterface {
	public List<Map<String, Object>>list();
	public List<Map<String, Object>>listarId(int id);
	public int add(menu p);
	public int edit(menu p);
	public int delete(int id);
	public List<Map<String, Object>>getLogin();
	List<Map<String, Object>> listall();
	
}
