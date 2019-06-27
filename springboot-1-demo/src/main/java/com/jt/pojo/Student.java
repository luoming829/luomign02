package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data					//默认添加get/set方法/toString
@Accessors(chain=true)	//开启链式加载
public class Student {
	private Integer id;
	private String studentName;
	
}
