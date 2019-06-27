package com.tedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tedu.pojo.Door;
import com.tedu.pojo.Order;
import com.tedu.service.DoorService;
import com.tedu.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private DoorService doorService;
	@Autowired
	private OrderService orderService;
	
	/** 1.查询所有订单信息 */
	@RequestMapping("/orderList")
	public String orderList(Model model) {
		//1.查询所有门店信息(List<Door>)
		List<Door> doorList = doorService.findAll();
		//2.将门店集合存入model,带到jsp
		model.addAttribute("doorList", doorList);
		//3.查询所有订单信息(List<Order>)
		List<Order> orderList = 
					orderService.findAll();
		//4.将订单集合存入model,带到jsp
		model.addAttribute("orderList", orderList);
		System.out.println(doorList);
		System.out.println(orderList);
		
		//转向订单列表页面
		return "order_list";
	}
	
	/** 2.查询所有门店并跳转到订单新增页面 */
	@RequestMapping("/toAddOrder")
	public String toAddOrder(Model model) {
		//1.查询所有门店信息
		List<Door> doorList = doorService.findAll();
		//2.带到订单新增页面取出并显示
		model.addAttribute("doorList", doorList);
		return "order_add";
	}
	
	/** 3.新增订单 */
	@RequestMapping("orderAdd")
	public String orderAdd(Order order) {
		//调用service层的方法新增订单
		orderService.addOrder(order);
		//重定向到查询所有订单的方法
		return "redirect:orderList";
	}
	
	
	
}






