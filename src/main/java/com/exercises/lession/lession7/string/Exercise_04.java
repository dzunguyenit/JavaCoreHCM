package com.exercises.lession.lession7.string;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		System.out.println("--------Exercise_04--------");
		Scanner scanner = new Scanner(System.in);
		String s;

		System.out.println("Input string: ");
		s = scanner.nextLine();

		int countWord = s.split("\\s+").length;

		System.out.println("Quantity of word = " + countWord);

	}
}