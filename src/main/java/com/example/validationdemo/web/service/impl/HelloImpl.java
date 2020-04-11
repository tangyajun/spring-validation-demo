package com.example.springdemo.web.service.impl;

import com.example.springdemo.web.service.HelloService;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-03-24-15:27
 **/
public class HelloImpl implements HelloService {
	@Override
	public String sayHello(String username) {
		System.out.println("-----------------hello "+username);
		return "hello "+username;
	}



	@Override
	public String toString() {
		return super.toString();
	}
}
