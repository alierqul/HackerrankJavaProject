package com.aliergul.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaRegex {
	private static final int count = 3;
	private static String[] test = { "5", "0", "15.6.0.0" };
	
	/**
	 * 1) \\d{1,2} herhangi bir veya iki basamaklı sayıyı yakalar
	 * 2) (0|1)\\d{2} 0 veya 1 ile başlayan herhangi bir üç basamaklı sayıyı yakalar
	 * 3) 2[0-4]\\d 200 ile 249 arasındaki sayıları yakalar.
	 * 4) 25[0-5] 250 ile 255 arasındaki sayıları yakalar.
	 * 
	 * \d öğesinin [0-9] ile aynı normal ifadelerdeki rakamları temsil ettiğini
	 * unutmayın
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = 3;
		String zeroTo255 = "(\\d{1,2}" + "||(0|1)\\d{2}" + "||2[0-4]\\d" + "||25[0-5])";
		for (int i = 0; i < count; i++) {
			
			try {
				
				System.out.println(Pattern
						.matches((zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255), test[i]));
				// System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
		
	}
}
