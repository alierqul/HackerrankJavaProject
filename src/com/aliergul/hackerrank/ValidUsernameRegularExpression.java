package com.aliergul.hackerrank;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidUsernameRegularExpression {
	public static void main(String[] args) {
		System.out.println(validateUserName("1Alierqul_01"));
	}
	
	// 8-30 karakter uzunluğğunda sadece aAzZ_0-9 karakterleri lacak
	private static String validateUserName(String input) {
		final String regex = "[aAzZ][\\w]{7,29}";
		try {
			if (Pattern.matches(regex, input)) {
				return "valid";
			} else {
				return "invalid";
			}
			
		} catch (PatternSyntaxException e) {
			return "invalid";
			
		}
		
	}
	
}
