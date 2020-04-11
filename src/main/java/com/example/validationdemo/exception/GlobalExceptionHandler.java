package com.example.validationdemo.exception;

import com.example.validationdemo.exception.BusinessException;
import com.example.validationdemo.web.response.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-27-14:21
 **/
@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseResult handleException(Exception e) {

		ResponseResult result=ResponseResult.fail(500,e.getMessage());
		return result;
	}

	@ExceptionHandler(BusinessException.class)
	public ResponseResult handleBusinessException(BusinessException e) {
		return ResponseResult.fail(500,e.getMessage());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseResult handleMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException) {
		StringBuilder errorMessage=new StringBuilder();
		List<ObjectError> objectErrors=methodArgumentNotValidException.getBindingResult().getAllErrors();
		if (!CollectionUtils.isEmpty(objectErrors)) {
			for (int i = 0; i < objectErrors.size(); i++) {
				if (i == 0) {
					errorMessage.append(objectErrors.get(i).getDefaultMessage());
				} else {
					errorMessage.append(",");
					errorMessage.append(objectErrors.get(i).getDefaultMessage());
				}
			}
		}else {
			errorMessage.append("MethodArgumentNotValidException occured.");
		}
		return ResponseResult.fail(400,errorMessage.toString());
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseResult handle(ConstraintViolationException constraintViolationException) {
		Set<ConstraintViolation<?>> violations = constraintViolationException.getConstraintViolations();
		String errorMessage = "";
		if (!violations.isEmpty()) {
			StringBuilder builder = new StringBuilder();
			violations.forEach(violation -> builder.append(" " + violation.getMessage()));
			errorMessage = builder.toString();
		} else {
			errorMessage = "ConstraintViolationException occured.";
		}
		return ResponseResult.fail(400,errorMessage);
	}
}
