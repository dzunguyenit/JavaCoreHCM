package com.exercises.lession.lession5;

import java.util.Scanner;

public class Exercise_02 {
//	  Các thao tác kiểm tra
//	  b. Mảng có phải là mảng toàn số nguyên tố
//	  c. Mảng có phải là mảng tăng dần

	public static int[] inputArray(int n) { // nhập mảng gồm n số nguyên
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static boolean isPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeArray(int[] a) {
		boolean result = true;
		for (int i = 0; i < a.length; i++) {
			if (!isPrimeNumber(a[i])) {
				return false;
			}
		}
		return result;
	}

	public static boolean isAscendingArray(int[] intArr) {
		for (int i = 0; i < intArr.length - 1; i++) {
			if (intArr[i] > intArr[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_02_b--------");
		Scanner scanner = new Scanner(System.in);
		int n;

		do {
			System.out.println("Input n > 0");
			n = scanner.nextInt();
		} while (n <= 0);

		int[] primeArray = inputArray(n);
		boolean checkEvenArr = isPrimeArray(primeArray);
		if (checkEvenArr) {
			System.out.println("Array contains all numbers are prime");
		} else {
			System.out.println("Array contains all numbers are not prime");
		}

		System.out.println("--------Exercise_02_c--------");

		int number;

		do {
			System.out.println("Input number of array > 0");
			number = scanner.nextInt();
		} while (number <= 0);

		int[] ascendingArray = inputArray(number);
		boolean isAscending = isAscendingArray(ascendingArray);
		if (isAscending) {
			System.out.println("Array contains all numbers are ascending");
		} else {
			System.out.println("Array contains all numbers are not ascending");
		}

	}
}