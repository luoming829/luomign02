package com.jt.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 要求通过yml文件实现对象的赋值操作
 *@Controller 		//标识controller层
 *@Service			/标识service层
 *@Repository	    //标识dao层
 *@author ta
 */
@Component		//管理对象
@ConfigurationProperties(prefix="user") 
/**
 * 使用说明:
 *   在配置文件中查找user的前缀,之后如果属性的名称与
 * key的名称一致,则利用对象的setXXX()进行属性赋值.
 * */
public class User {
	private Integer id;
	private String username;
	private Integer age;
	private String sex;
	
	/*@Value("${user.id}") //从spring容器中获取数据
	private Integer id;
	@Value("${user.username}")
	private String username;
	@Value("${user.age}")  //无需添加set方法
	private Integer age;
	@Value("${user.sex}")
	private String sex;*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
