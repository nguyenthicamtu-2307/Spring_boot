package com.sinfloo.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinfloo.service.khachhangService;
import com.sinfloo.service.menuService;

@RestController
@RequestMapping("/menu")
public class menuController {
	@Autowired //sẽ tự động inject bean tương ứng vào vị trí được đánh dấu
	private menuService service;
	@GetMapping("/list")//xử lý hàm bằng phương thức get
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}
}
