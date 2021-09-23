package com.exercises.lession.lession17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise_01 {
	public static void main(String[] args) {
		String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
		Pattern pattern = Pattern.compile("\\d{1,2}[\\-\\/]\\d{2}[\\-\\/]\\d{4}");
		Matcher matcher = pattern.matcher(text1);

		System.out.println("Ngày tháng trong chuỗi text1: " + text1);
		while (matcher.find()) {
			System.out.println(text1.substring(matcher.start(), matcher.end()));
		}
	}
}
