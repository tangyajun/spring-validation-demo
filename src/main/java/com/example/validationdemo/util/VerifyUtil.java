package com.example.springdemo.util;

import com.example.springdemo.constant.RegexEnum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yang
 * @Description TO DO
 * @create 2019-12-27-16:03
 **/
public class VerifyUtil {

	/**
	 *使用正则表达式验证手机号格式是否正确
	 * @param mobilePhoneNumber
	 * @return
	 */
	public static boolean verifyMobilePhoneNumber(String mobilePhoneNumber) {
		Pattern pattern=Pattern.compile(RegexEnum.MOBILE_VALIDATE.getValue());
		Matcher matcher=pattern.matcher(mobilePhoneNumber);
		return matcher.matches();
	}

	/**
	 * 使用正则表达式验证邮箱格式是否正确
	 * @param email
	 * @return
	 */
	public static boolean verifyEmail(String email) {
		return Pattern.matches(RegexEnum.EMAIL_VALIDATE.getValue(),email);
	}
}
