package com.tedu.service;
import java.util.List;
import com.tedu.pojo.Door;

public interface DoorService {
	
	/** 1.查询所有门店信息 */
	public List<Door> findAll();
	
	/** 2.新增门店信息 */
	public void addDoor(Door door);
	
	/** 3.根据ID删除门店 */
	public void deleteById(Integer id);
	
	/** 4.根据ID查询门店详情信息 */
	public Door findById(Integer id);
	
	/** 5.根据ID修改门店信息 */
	public void updateById(Door door);
	
	
	
	
}






