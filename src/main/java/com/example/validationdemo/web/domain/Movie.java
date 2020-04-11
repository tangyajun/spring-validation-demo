package com.example.validationdemo.web.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-27-13:50
 **/
@Getter
@Setter
public class Movie {
	private String id;
	@NotEmpty(message = "Movie name cannot be empty")
	private String name;
	@NotNull(message = "电影时长不能为空")
	private Integer duration;

	@NotNull(message = "演员不能为空")
	@NotEmpty(message = "演员不能为空")
	private List<@Valid Actor> actors;

	//@NotEmpty(message = "email cannot be empty")
	//private String email;
	//@NotEmpty(message = "手机号不能为空")
	//private String mobilePhone;

	@NotEmpty(message = "电影描述不能为空")
	private String description;
}
