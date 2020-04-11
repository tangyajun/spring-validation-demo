package com.example.validationdemo.validation;

import com.example.springdemo.util.VerifyUtil;
import com.example.validationdemo.annotation.EmailConstraint;
import com.example.validationdemo.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-26-15:25
 **/
public class EmailConstraintValidator  implements ConstraintValidator<EmailConstraint,Object> {
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		System.out.println("start validate ");
		if (value== null) {
			throw new BusinessException("邮箱地址不能为空");
		}
		return VerifyUtil.verifyEmail(value.toString());
	}
}
