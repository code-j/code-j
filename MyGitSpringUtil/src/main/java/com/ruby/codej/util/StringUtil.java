package com.ruby.codej.util;

public class StringUtil {

	/**
	 * String을 받아서 null/공백일 경우 false를 출력하는 method
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
}
