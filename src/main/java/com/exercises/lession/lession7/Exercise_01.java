package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_01 {

	public static String getUppercaseCharacters(String s) {
		String uppercaseCharacters = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				uppercaseCharacters += s.charAt(i);
			}
		}

		return uppercaseCharacters;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_01--------");
		Scanner scanner = new Scanner(System.in);
		String s;

		System.out.println("Input string: ");
		s = scanner.nextLine();

		if (!getUppercaseCharacters(s).isEmpty()) {
			System.out.println(getUppercaseCharacters(s));

		} else
			System.out.println("String n does not contains uppercase characters");

	}
}