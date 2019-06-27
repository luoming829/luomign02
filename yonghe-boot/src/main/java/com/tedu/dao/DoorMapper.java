package com.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tedu.pojo.Door;

/**
 * Mapper接口
 */
//@Mapper
public interface DoorMapper {
	
	/** 1.查询所有门店信息 */
	public List<Door> findAll();
	
	/** 2.新增门店信息 */
	public void addDoor(Door door);
	
	/** 3.根据ID删除门店 */
	public void deleteById(Integer id);
	
	/** 4.根据id查询门店详情 */
	public Door findById(Integer id);
	
	/** 5.根据ID修改门店信息 */
	public void updateById(Door door);
	
}








