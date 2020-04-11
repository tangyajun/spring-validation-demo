package com.example.validationdemo.web.controller;

import com.example.validationdemo.web.domain.User;
import com.example.validationdemo.web.response.ResponseResult;
import com.example.validationdemo.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-11-10:24
 **/
@Validated
@RestController
@RequestMapping(value = "/users")
public class UserController {


	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}

	@PostMapping
	public ResponseResult createUser(@RequestBody @Valid User user) {
		userService.addUser(user);
		return ResponseResult.success();
	}
}
