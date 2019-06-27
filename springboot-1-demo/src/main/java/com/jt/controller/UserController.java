package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.Dog;
import com.jt.pojo.Student;
import com.jt.pojo.User;

/**
 * 需求:如果以后只返回json或者字符串,并且不需要页面跳转(不走视图解析器)
 * @author ta
 */
@RestController //@Controller +@ResponseBody 通过属性的hash值进行输出. 对象输出没有顺序
public class UserController {
	
	@Autowired
	private User user;
	
	@Autowired
	private Dog dog;
	
	@RequestMapping("/user/getDog")
	public Dog getDog() {
		
		return dog;
	}
	
	@RequestMapping("/user/getUser")
	public User getUser() {
	
		return user;
	}
}
