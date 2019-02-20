package com.asiainfo;

import java.util.Arrays;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 加密版
 * 
 * @author zhangzhiwang
 * @date 2019年2月20日 下午1:39:19
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	private String[] encryptKeys = new String[] {"aaa", "bbb"};
	
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if(!Arrays.asList(encryptKeys).contains(propertyName)) {
			return propertyValue;
		}
		
		return DESUtils.getDecryptString(propertyValue);
	}
	
	public static void main(String[] args) {
//		System.out.println(DESUtils.getEncryptString("BMW"));
		System.out.println(DESUtils.getDecryptString("lOLqi5hIQKQ="));
	}
}
