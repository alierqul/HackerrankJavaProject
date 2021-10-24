package com.aliergul.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaRegex2 {
	private static final int count = 5;
	private static String[] test = { "Goodbye bye bye world world world", "Sam went went to to to his business",
			"Reya is is the the best player in eye eye game", "in inthe", "Hello hello Ab aB" };
	
	public static void main(String[] args) {
		// \b(\w+)(\s+\1\b)*
		// \b(\w+)(\W+\1\b)+
		String pattern = "\\b(\\w+)(\\s+\\1\\b)*";
		Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		for (int i = 0; i < count; i++) {
			Matcher m = p.matcher(test[i]);
			try {
				
				// Check for subsequences of input that match the compiled pattern
				while (m.find()) {
					test[i] = test[i].replaceAll(m.group(0), m.group(1));
					
				}
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			System.out.println(test[i]);
		}
		
	}
}
