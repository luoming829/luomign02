package com.tedu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tedu.pojo.Door;

/** 测试spring的运行环境 */
public class TestSpring {
	public static void main(String[] args) {
		//1.读取spring的配置文件
		ClassPathXmlApplicationContext ac = 
		new ClassPathXmlApplicationContext(
			"spring/applicationContext.xml");
		//2.获取Door类的实例
		Door door = (Door) ac.getBean("door");
		System.out.println(door);
		
		
	}
}





