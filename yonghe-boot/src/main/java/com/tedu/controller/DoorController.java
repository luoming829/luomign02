package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedu.pojo.Door;
import com.tedu.service.DoorService;

/** 门店管理模块 */
//@RestController  //不加载页面
@Controller
public class DoorController {
	@Autowired /* 自动装配: 由spring容器创建
	该类(或接口)的实例, 并赋值给当前变量 */
	private DoorService service;
	
	/** 1.查询所有门店信息 */
	@RequestMapping("/doorList")
	public String doorList(Model model) {
		//查询所有门店信息,返回List<Door>
		List<Door> list = service.findAll();
		//将所有门店的集合存入Model中
		model.addAttribute("list", list);
		System.out.println(list);
		//转向door_list.jsp
		return "door_list";
		//return list;
	}
	
	/** 2.新增门店信息 */
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door, Model model) {
		//1.调用service层的新增门店的方法
		service.addDoor( door );
		
		//方式1:直接调用doorList方法
		//return doorList(model);
		//方式2:转发到doorList方法
		//return "forward:/doorList";
		//方式3:重定向到doorList方法
		return "redirect:/doorList";
	}
	
	/** 3.根据ID删除门店信息 */
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id) {
		//调用service层的方法根据ID删除门店
		service.deleteById( id );
		
		//方式3:重定向到doorList方法
		return "redirect:/doorList";
	}
	
	/** 4.根据ID查询门店信息 */
	@RequestMapping("/doorInfo")
	public String doorInfo(
			Model model, Integer id) {
		//调用service层的根据ID查询门店详情的方法
		Door door = service.findById( id );
		//将门店对象存入Model中
		model.addAttribute("door", door);
		//转向门店修改页面
		return "door_update";
	}
	
	/** 5.根据ID修改门店信息 */
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door) {
		//调用service层的根据ID修改门店的方法
		service.updateById( door );
		
		//方式3:重定向到doorList方法
		return "redirect:/doorList";
	}
	
	
	
	/** 通用的页面跳转的方法
	 * 如果用户访问的路径为 /index、/_top
	 * 则 page的值就是 index、_top
	 *  /WEB-INF/pages/xx.jsp
	 */
	@RequestMapping("/{page}")
	public String page(
			@PathVariable String page) {
		return page;
	}
	
}








