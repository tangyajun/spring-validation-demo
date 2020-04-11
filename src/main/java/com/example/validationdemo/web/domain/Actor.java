package com.example.validationdemo.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-10-23:28
 **/
@Getter
@Setter
public class Actor {
	@NotEmpty(message = "演员姓名不能为空")
	private String name;
	@NotEmpty(message = "演员备注不能为空")
	private String remark;
}
