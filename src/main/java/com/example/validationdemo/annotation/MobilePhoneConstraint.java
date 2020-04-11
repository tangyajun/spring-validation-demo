package com.example.springdemo.annotation;


import com.example.springdemo.validation.MobilePhoneConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-27-10:11
 **/
@Constraint(validatedBy = MobilePhoneConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MobilePhoneConstraint {
	String message() default "手机号格式错误";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
