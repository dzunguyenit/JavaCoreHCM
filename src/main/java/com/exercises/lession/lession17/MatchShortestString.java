package com.exercises.lession.lession17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchShortestString {
	public static void main(String[] args) {

//		

		String text1 = "Email: vunguyen1993, vunguyen19934, vunguyen19935";
		Pattern pattern = Pattern.compile("\\bvunguyen1993\\b");
//		Pattern pattern = Pattern.compile("vunguyen1993");
		
		Matcher matcher = pattern.matcher(text1);

		System.out.println("Email trong chuỗi text: " + text1);
		while (matcher.find()) {
			System.out.println(text1.substring(matcher.start(), matcher.end()));
		}
	}
}
