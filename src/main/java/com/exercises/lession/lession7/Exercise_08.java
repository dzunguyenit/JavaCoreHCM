package com.exercises.lession.lession7;

import java.util.Scanner;

public class Exercise_08 {

	public static int[][] inputMatrix() { // nhập mảng gồm n số nguyên
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

	public static void main(String[] args) {
		System.out.println("--------Exercise_07--------");
//		int a[][] = inputMatrix();
		int ret[][] = generateMatrix(3, 3, 0, 50);
		printMatrix(ret);
		System.out.println("Sum = " + sumMatrix(ret));
	}
}