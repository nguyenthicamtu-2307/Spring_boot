package com.sinfloo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.menuInterface;
import com.sinfloo.modelo.menu;
@Service
public class menuDAO implements menuInterface {
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblcategory");
		return list;
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
