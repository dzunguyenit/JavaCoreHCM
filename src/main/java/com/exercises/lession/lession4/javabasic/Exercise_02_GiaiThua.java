package com.exercises.lession.lession4.javabasic;

import java.util.Scanner;

public class Exercise_02_GiaiThua {

	// Nhập một số nguyên dương n (n > 0).
	// Hãy cho biết:
	// S = 1*2*...*n = n!

	public static long getFactorialNumber(int n) {
		if (n == 0)
			return 0;
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			sum = sum *= i;

		}
		return sum;
	}

	// Nhập một số nguyên dương n (n > 0).
	// Hãy cho biết:
	// S = 1! + 2! + ... + n!

	public static long sumFactorial(int n) {
		if (n == 0)
			return 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += getFactorialNumber(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_02_d--------");
		System.out.println("Input n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		long factorial = getFactorialNumber(n);

		System.out.println(n + "!= " + factorial);

		System.out.println("--------Exercise_02_e--------");
		System.out.println("Input n: ");

		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i == number) {
				System.out.print(i + "! ");
			} else {
				System.out.print(i + "! + ");
			}
		}

		System.out.println("= " + sumFactorial(number));

	}

}