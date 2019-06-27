package com.tedu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/** 门店实体类, 用于封装门店信息 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Door {
	private Integer id;
	private String name;
	private String tel;
	private String addr;
	
	
}
