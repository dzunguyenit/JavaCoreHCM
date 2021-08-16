package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		System.out.println("--------Exercise_03--------");

		Scanner scanner = new Scanner(System.in);
		String s;
		char c = 'n';

		System.out.println("Input string s: ");
		s = scanner.nextLine();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}

		System.out.printf("Character \"%c\" appear %d times in string \"%s\" ", c, count, String.format(s, count));

	}
}