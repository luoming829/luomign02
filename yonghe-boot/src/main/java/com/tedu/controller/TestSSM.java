package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/** 测试SSM开发环境 */
@Controller
public class TestSSM {
	@Autowired /* 自动装配: 由spring容器创建
	该类(或接口)的实例, 并赋值给当前变量 */
	private DoorMapper mapper;
	
	@RequestMapping("/testSSM")
	public String testSSM(Model model) {
		//查询所有门店信息,返回List<Door>
		List<Door> list = mapper.findAll();
		//将所有门店的集合存入Model中
		model.addAttribute("doorList", list);
		//转向door_list.jsp
		return "door_list";
	}
	
}








