package com.exercises.lession.lession4.javabasic;

import java.util.Scanner;

public class Exercise_01_SoDoiXung {

	// Nhập một số nguyên dương n (n > 0).
	// Hãy cho biết:
	// a. Có phải là số đối xứng?
	public static boolean isSymmetryNumber(int number) {
		boolean result = false;

		int reverseNumber = 0;

		int originalNumber = number;
		while (number != 0) {
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number /= 10;
		}
		if (reverseNumber == originalNumber)
			return true;
		return result;
	}

	// Nhập một số nguyên dương n (n > 0).
	// Hãy cho biết:
	// b. Có phải là số chính phương?

	public static boolean isSquareNumber(int n) {
		boolean result = false;
		int temp = (int) Math.sqrt(n);
		if (temp * temp == n)
			return true;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_01_a--------");
		System.out.println("Input n: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		if (isSymmetryNumber(number)) {
			System.out.println(number + " is a symmetry number");
		} else {
			System.out.println(number + " is not a symmetry number");
		}

		System.out.println("--------Exercise_01_b--------");
		System.out.println("Input n: ");
		int n = scanner.nextInt();

		if (isSquareNumber(n)) {
			System.out.println(n + " is a square number");
		} else {
			System.out.println(n + " is not a square number");
		}

	}
}