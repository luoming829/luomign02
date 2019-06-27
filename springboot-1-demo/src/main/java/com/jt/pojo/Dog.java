package com.jt.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource
(value="classpath:/properties/dog.properties")//表示加载任意的properties到spring容器中
@Component
public class Dog {
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
