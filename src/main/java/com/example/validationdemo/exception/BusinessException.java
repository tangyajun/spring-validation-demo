package com.example.validationdemo.exception;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-10-23:21
 **/
@Getter
public class BusinessException extends RuntimeException {
	private String message;
	private Throwable throwable;
	public BusinessException(String message) {
		this(message,null);
	}

	public BusinessException(String message,Throwable throwable) {
		super(message,throwable);
	}
}
