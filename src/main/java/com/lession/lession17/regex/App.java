package com.lession.lession17.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		// String str = "1mount";
		// System.out.println(str.matches(".{6}"));
		//
		// String p = "^(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}$";
		// String input = "090-876-5432";
		// System.out.println(input.matches(p));
		//
		// String str1 = "Welcome to-gpcoder ";
		// String[] parts = str1.split("\\s+|-");
		// System.out.println(Arrays.toString(parts));

		// String input = "090-876-5432";
		// String regex = "^(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}$";
		//
		// Pattern p = Pattern.compile(regex);
		// Matcher m = p.matcher(input);
		// System.out.println(m.matches());

		// Pattern p = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		// Matcher m = p.matcher("Visit W3Schools!");
		// System.out.println(m.matches());
		//
		// boolean matchFound = m.find();
		// if (matchFound) {
		// System.out.println("Match found");
		// System.out.println(m.start());
		// System.out.println(m.end());
		// } else {
		// System.out.println("Match not found");
		// }

		String regex = "(0|\\+84)\\d{2}[\\.\\-\\s]?\\d{3}[\\.\\-\\s]?\\d{4}";
		String input = "0908765432, +84908765432, 090.876.5432, 090-876-5432, 090 876 5432";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);

		boolean matchFound = m.find();
		while (matchFound) {
			String phone = input.substring(m.start(), m.end());
			System.out.println(phone);

			matchFound = m.find();
		}
	}
}
