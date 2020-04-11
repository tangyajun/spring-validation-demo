package com.example.validationdemo.web.service.impl;

import com.example.validationdemo.constant.Constants;
import com.example.validationdemo.exception.BusinessException;
import com.example.validationdemo.web.domain.User;
import com.example.validationdemo.web.service.UserService;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-04-11-10:26
 **/
@Service
public class UserServiceImpl implements UserService {
	@Override
	public void addUser(User user) {
		String email=user.getEmail();
		//
		if (!Pattern.matches(Constants.EMAIL_VALIDATION_REGP,email)) {
			throw new BusinessException("邮箱地址格式不正确");
		}
	}
}
