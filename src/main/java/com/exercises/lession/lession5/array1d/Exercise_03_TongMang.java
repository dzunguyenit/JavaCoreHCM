package com.exercises.lession.lession5.array1d;

import java.util.Scanner;

public class Exercise_03_TongMang {

//	Các thao tác tính toán
//	a. Có bao nhiêu số chia hết cho 4 nhưng không chia hết cho 5
//	b. Tổng các số nguyên tố có trong mảng

	public static int[] inputArray(int n) { // nhập mảng gồm n số nguyên
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		return a;
	}

	public static int countDivisible(int[] array) {
		int count = 0;
		for (int item : array) {
			if (item % 4 == 0 && item % 5 != 0) {
				count++;
			}
		}
		return count;
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

	public static int sumPrimeArray(int[] a) {
		int sum = 0;
		for (int item : a) {
			if (isPrimeNumber(item)) {
				sum += item;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_03_a--------");
		Scanner scanner = new Scanner(System.in);
		int n;

		do {
			System.out.println("Input n > 0");
			n = scanner.nextInt();
		} while (n <= 0);

		int[] divisibleArray = inputArray(n);
		int divisibleNumber = countDivisible(divisibleArray);
		System.out.printf("Array contains %d number divisible by 4 and not divisible by 5", divisibleNumber);

		System.out.println("--------Exercise_03_b--------");

		int number;

		do {
			System.out.println("Input number of array > 0");
			number = scanner.nextInt();
		} while (number <= 0);

		int[] primeArray = inputArray(number);
		int sumPrime = sumPrimeArray(primeArray);
		System.out.printf("Sum prime number in array = " + sumPrime);

	}
}