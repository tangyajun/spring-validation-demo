package com.example.validationdemo.web.domain;

import com.example.validationdemo.annotation.EmailConstraint;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-11-10:22
 **/
@Getter
@Setter
public class User {
	@NotNull(message = "用户名必填")
	@NotEmpty(message = "用户名不能为空")
	private String username;
	@NotNull(message = "密码必填")
	@NotEmpty(message = "密码不能为空")
	private String password;

	@NotNull(message = "邮箱地址必填")
	@NotEmpty(message = "邮箱地址不能为空")
	@EmailConstraint(message = "邮箱地址格式不正确")
	private String email;
}
