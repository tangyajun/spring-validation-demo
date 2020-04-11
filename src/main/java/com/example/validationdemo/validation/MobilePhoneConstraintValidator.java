package com.example.springdemo.validation;



import com.example.springdemo.annotation.MobilePhoneConstraint;
import com.example.springdemo.util.VerifyUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-27-10:10
 **/
public class MobilePhoneConstraintValidator implements ConstraintValidator<MobilePhoneConstraint, Object> {

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		System.out.println("start validate ");
		return VerifyUtil.verifyMobilePhoneNumber(value.toString());
	}
}
