package com.example.springdemo.constant;

import java.util.Arrays;
import java.util.List;

/**
 * 正则枚举
 */
public enum RegexEnum {
	// 邮箱验证正则
	//EMAIL_VALIDATE("邮箱验证正则","^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$"),
	EMAIL_VALIDATE("邮箱验证正则","^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$"),
	// 手机号验证正则
	MOBILE_VALIDATE("手机号验证正则","^[1][3,4,5,7,8][0-9]{9}$");
	private String desc;
	private String value;

	private RegexEnum(String desc, String value) {
		this.desc=desc;
		this.value=value;
	}

	public RegexEnum getRegexEnum(String desc) {
		List<RegexEnum> regexEnumList= Arrays.asList(values());
		for (RegexEnum regexEnum : regexEnumList) {
			if (regexEnum.getDesc().equals(desc)) {
				return regexEnum;
			}
		}
		return null;
	}

	public String getDesc() {
		return desc;
	}

	public String getValue() {
		return value;
	}
}
