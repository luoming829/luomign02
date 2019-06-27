package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Order;

public interface OrderService {
	/**1.查询所有订单信息*/
	public List<Order> findAll();
	/**2.新增订单信息*/
	public void addOrder(Order order);
}







