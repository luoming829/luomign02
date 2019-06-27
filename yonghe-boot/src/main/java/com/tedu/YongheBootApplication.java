package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tedu.dao")
public class YongheBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(YongheBootApplication.class, args);
		
	}

}
