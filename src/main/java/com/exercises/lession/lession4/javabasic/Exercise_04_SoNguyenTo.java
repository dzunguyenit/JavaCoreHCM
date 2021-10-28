package com.exercises.lession.lession4.javabasic;

public class Exercise_04_SoNguyenTo {

	// Tính tổng các số nguyên tố nhỏ hơn n (0 < n < 50)

	public static boolean isPrime(int n) {
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

	public static void main(String[] args) {
		System.out.println("--------Exercise_04--------");
		int sum = 0;

		for (int i = 1; i < 50; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				sum += i;
			}
		}

		System.out.println("\nSum factorial number < 50 = " + sum);

	}

}