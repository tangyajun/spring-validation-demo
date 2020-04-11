package com.example.springdemo.util;

import lombok.Getter;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-10-12:43
 **/
@Getter
public enum StatusCode {
	/**
	 * 操作成功
	 */
	SUCCESS(200,"success"),
	/**
	 * 新增成功
	 */
	ADD_SUCCESS(204,"success"),
	/**
	 * 操作失败
	 */
	FAIL(-1,"fail"),
	/**
	 * 资源不存在
	 */
	NOT_FOUND(404,"resource not found"),
	/**
	 * 没有权限访问
	 */
	NOT_AUTH(401,"没有权限访问"),
	/**
	 * 未知错误
	 */
	ERROR(500,"未知部错误");
	private int code;
	private String message;

	private StatusCode(int code, String message) {
	    this.code=code;
	    this.message=message;
	}
}
