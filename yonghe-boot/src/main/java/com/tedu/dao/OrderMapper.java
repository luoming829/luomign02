package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tedu.pojo.Order;
//@Mapper
public interface OrderMapper {
	/** 1.查询所有订单信息 */
	List<Order> findAll();
	/** 2.新增订单信息 */
	void addOrder(Order order);
	
	
	
	
	
	
	
}




