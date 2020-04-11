package com.example.validationdemo.annotation;

import com.example.validationdemo.validation.EmailConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-12-26-15:22
 **/
@Documented
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Constraint(validatedBy = EmailConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailConstraint {
	String message() default "email格式错误";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
