package com.exercises.lession.lession8;

import java.util.Scanner;

public class Exercise_01_02_03_04 {

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
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
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
	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// a. Dòng d, cột c

	public static int sumMatrixWithRowColumn(int[][] a, int row, int column) {
		int sumRow = 0;
		int sumColumn = 0;

		for (int i = 0, r = a.length; i < r; i++) {
			sumRow += a[row][i];
		}

		for (int i = 0, r = a.length; i < r; i++) {
			if (a[i][column] != a[row][column]) {
				sumRow += a[i][column];
			}
		}
		int sum = sumRow + sumColumn;
		return sum;

	}
	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// b. Đường chéo chính (ma trận vuông)

	public static int sumMatrixMainDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (i == j) {
					sum += a[i][j];
				}
			}
		}
		return sum;

	}

	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// c. Nửa trên đường chéo chính (ma trận vuông)
	public static int sumMatrixAboveMainDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (j > i) {
					sum += a[i][j];
				}
			}
		}
		return sum;

	}

	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// d. Nửa trên đường chéo phụ (ma trận vuông)
	public static int sumMatrixAboveAuxiliaryDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c - 1 - i; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// d. Nửa dưới đường chéo phụ (ma trận vuông)
	public static int sumMatrixBelowAuxiliaryDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = a[0].length - i; j < a[0].length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// b. Đường chéo phụ (ma trận vuông)

	public static int sumMatrixAuxiliaryDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (i + j + 1 == row)
					sum = sum + a[i][j];
			}
		}
		return sum;

	}

	// Exercise_04
	// Cho trước ma trận a, kích thước m x n. Tính tổng các phần tử trên:
	// c. Nửa dưới đường chéo chính (ma trận vuông)
	public static int sumMatrixBelowMainDiagonal(int[][] a, int row) {
		int sum = 0;
		for (int i = 0, r = a.length; i < r; i++) {
			for (int j = 0, c = a[0].length; j < c; j++) {
				if (i > j) {
					sum += a[i][j];
				}
			}
		}
		return sum;

	}

	public static void main(String[] args) {

//		int a[][] = inputMatrix();
		int ret[][] = generateMatrix(3, 3, 0, 50);
		printMatrix(ret);
		System.out.println("\n--------Exercise_01--------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Input x: ");
		int x = sc.nextInt();

		if (isContainX(ret, x)) {
			System.out.println("Matrix contains x");
		} else
			System.out.println("Matrix does not contains x");

		System.out.println("\n--------Exercise_02--------");
		int maxtrixEx2[][] = generateMatrix(2, 2, 0, 50);
		printMatrix(maxtrixEx2);

		if (isPrimeMatrix(maxtrixEx2)) {
			System.out.println("Matrix contains all prime number");
		} else
			System.out.println("Matrix does not contains all prime number");

		System.out.println("\n--------Exercise_03--------");
		int maxtrixEx3[][] = generateMatrix(2, 2, 0, 50);
		printMatrix(maxtrixEx3);

		System.out.println("Max = " + max(maxtrixEx3));

		System.out.println("\n--------Exercise_04a--------");
		int maxtrixEx4a[][] = generateMatrix(4, 4, 0, 50);
		printMatrix(maxtrixEx4a);

		System.out.println("Input row: ");
		int rowMaxtrix = sc.nextInt();
		System.out.println("Input column: ");
		int columnMaxtrix = sc.nextInt();

		System.out.printf("Sum matrix row %d, column %d = %d\n", rowMaxtrix, columnMaxtrix,
				sumMatrixWithRowColumn(maxtrixEx4a, rowMaxtrix, columnMaxtrix));

		System.out.println("\n--------Exercise_04b--------");

		System.out.println("Input row: ");
		int row = sc.nextInt();

		int maxtrixEx4[][] = generateMatrix(row, row, 0, 50);
		printMatrix(maxtrixEx4);

		System.out.println("Sum matrix Main Diagonal: " + sumMatrixMainDiagonal(maxtrixEx4, row));
		System.out.println("Sum matrix Auxiliary Diagonal: " + sumMatrixAuxiliaryDiagonal(maxtrixEx4, row));

		System.out.println("\n--------Exercise_04c--------");

		System.out.println("Sum matrix above Main Diagonal: " + sumMatrixAboveMainDiagonal(maxtrixEx4, row));
		System.out.println("Sum matrix below Main Diagonal: " + sumMatrixBelowMainDiagonal(maxtrixEx4, row));

		System.out.println("\n--------Exercise_04d--------");

		System.out.println("Sum matrix above Auxiliary Diagonal: " + sumMatrixAboveAuxiliaryDiagonal(maxtrixEx4, row));
		System.out.println("Sum matrix below Auxiliary Diagonal: " + sumMatrixBelowAuxiliaryDiagonal(maxtrixEx4, row));
	}
}