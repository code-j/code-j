package com.ruby.codej.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testIsEmpty() {
		assertTrue("문자열에 null이 들어올 때", StringUtil.isEmpty(null));
		assertTrue("문자열에 공백이 들어올 때", StringUtil.isEmpty(""));

		assertFalse("문자열이 있 을때", StringUtil.isEmpty("message!!"));
	}


	@Test
	public void testIsNotEmpty() {
		assertFalse("문자열에 null이 들어올 때 실패", StringUtil.isNotEmpty(null));
		assertFalse("문자열에 공백이 들어올 때 실패", StringUtil.isNotEmpty(""));

		assertTrue("문자열이 있 을때 성공", StringUtil.isNotEmpty("message!!"));
	}

}
