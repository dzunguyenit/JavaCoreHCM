package com.lession.lession17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {
	public static void main(String[] args) {

		String text1 = "Email: {{email}}, Phone: {{phone}}, Name: {{name}}";
		Pattern pattern = Pattern.compile("\\{\\{(.*?)\\}\\}");
		Matcher matcher = pattern.matcher(text1);

		System.out.println("Email trong chuỗi text: " + text1);
		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
}
