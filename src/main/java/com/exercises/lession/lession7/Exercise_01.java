package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		System.out.println("--------Exercise_01--------");
		Scanner scanner = new Scanner(System.in);
		String n;

		System.out.println("Input string: ");
		n = scanner.nextLine();

		for (int i = 0; i < n.length(); i++) {
			if (Character.isUpperCase(n.charAt(i))) {
				System.out.print(n.charAt(i));
			}
		}

	}
}