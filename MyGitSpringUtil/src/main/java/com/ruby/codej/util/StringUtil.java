package com.ruby.codej.util;

public class StringUtil {

	/**
	 * 문자열을 받아서 null/공백일 경우 true를 출력하는 method
	 * @author woohyun
	 * @param message
	 * @return boolean(true/false)
	 */
	public static boolean isEmpty(String message){
		boolean flag = false;

		if( message==null || message.length()<=0)
			flag = true;

		return flag;
	}

	/**
	 * 문자열을 받아서 null/공백이 아닐 경우 true를 출력하는 method
	 * @author woohyun
	 * @param message
	 * @return boolean(true/false)
	 */
	public static boolean isNotEmpty(String message){
		return !isEmpty(message);
	}

}
