package com.tedu.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/** 测试Mybatis的运行环境 */
public class TestMybatis {
	public static void main(String[] args) throws IOException {
		//1.读取mybatis-config.xml文件
		InputStream in = 
			Resources.getResourceAsStream(
			"mybatis/mybatis-config.xml");
		//2.获取SqlSessionFactory工厂对象
		SqlSessionFactory factory = 
			new SqlSessionFactoryBuilder()
			.build(in);
		//3.获取SqlSession对象
		SqlSession session = 
				factory.openSession();
		
		//4.获取Mapper接口实现类的实例
		DoorMapper mapper = session
			.getMapper( DoorMapper.class );
		
		//5.执行查询sql,并输出结果
		List<Door> list = mapper.findAll();
		for(Door door : list) {
			System.out.println(door);
		}
	}
}





