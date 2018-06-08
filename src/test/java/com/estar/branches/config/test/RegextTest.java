package com.estar.branches.config.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegextTest {

	public static void main(String[] args) {
		String regex = "^((?!ref:T(\\d)+).)*";
		
		String message = "测试与Phabricator自动关联"
				+ "ref:AT1";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(message);
		System.out.println(matcher.matches());
	}
}
