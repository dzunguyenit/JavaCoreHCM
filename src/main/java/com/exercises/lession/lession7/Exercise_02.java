package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_02 {

	public static String getAlphabetCharacters(String s) {
		String alphabetCharacters = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				alphabetCharacters += s.charAt(i);
			}
		}

		return alphabetCharacters;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_02--------");
		Scanner scanner = new Scanner(System.in);
		String s;

		System.out.println("Input string: ");
		s = scanner.nextLine();

		if (!getAlphabetCharacters(s).isEmpty()) {
			System.out.println(getAlphabetCharacters(s));

		} else
			System.out.println("String n does not contains alphabet characters");

	}
}