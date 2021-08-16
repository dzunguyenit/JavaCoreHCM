package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		System.out.println("--------Exercise_02--------");
		Scanner scanner = new Scanner(System.in);
		String s;

		System.out.println("Input string: ");
		s = scanner.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}

	}
}