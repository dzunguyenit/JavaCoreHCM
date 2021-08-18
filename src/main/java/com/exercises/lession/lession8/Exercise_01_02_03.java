package com.exercises.lession.lession8;

import java.util.Scanner;

public class Exercise_01_02_03 {

	public static int[][] inputMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input row: ");
		int r = sc.nextInt();
		System.out.println("Input column: ");
		int c = sc.nextInt();
		int[][] a = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.format("a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

	public static void printMatrix(int[][] a) {
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int sumMatrix(int[][] a) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				sum += a[i][j];
			}
		}
		return sum;

	}

	public static int[][] generateMatrix(int r, int c, int min, int max) { // nhập mảng gồm n số nguyên
		int[][] ret = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ret[i][j] = (int) Math.floor(Math.random() * (max - min) + min);
			}
		}
		return ret;
	}

	public static boolean isContainX(int[][] a, int x) {
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (a[i][j] == x) {
					System.out.format("a[%d][%d]\n", i, j);
					return true;
				}
			}
		}
		return false;

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

	public static boolean isPrimeMatrix(int[][] a) {
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (!isPrimeNumber(a[i][j])) {
					return false;
				}
			}
		}
		return true;
	}

	public static int max(int[][] a) {
		int max = a[0][0];

		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int a[][] = inputMatrix();
		int ret[][] = generateMatrix(3, 3, 0, 50);
		printMatrix(ret);
		System.out.println("--------Exercise_01--------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = sc.nextInt();

		if (isContainX(ret, x)) {
			System.out.println("Matrix contains x");
		} else
			System.out.println("Matrix does not contains x");

		System.out.println("--------Exercise_02--------");
		int maxtrixEx2[][] = generateMatrix(2, 2, 0, 50);
		printMatrix(maxtrixEx2);

		if (isPrimeMatrix(maxtrixEx2)) {
			System.out.println("Matrix contains all prime number");
		} else
			System.out.println("Matrix does not contains all prime number");

		System.out.println("--------Exercise_03--------");
		int maxtrixEx3[][] = generateMatrix(2, 2, 0, 50);
		printMatrix(maxtrixEx3);

		System.out.println("Max = " + max(maxtrixEx3));

	}
}