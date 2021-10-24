package com.aliergul.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class DeletedRepeatedWords {
	public static void main(String[] args) {
		System.out.println(deleteRepeatedWords("ali ali hello Hello Java java JAVA"));
	}
	
	private static String deleteRepeatedWords(String input) {
		String regex = "\\b(\\w+)(\\s+\\1\\b)*";
		
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		try {
			Matcher m = p.matcher(input);
			
			while (m.find()) {
				input = input.replaceAll(m.group(0), m.group(1));
			}
			
		} catch (PatternSyntaxException e) {
			System.out.println("Invalid");
		}
		
		return input;
	}
	
}
