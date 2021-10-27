package com.exercises.lession.lession4;

import java.util.Scanner;

public class Exercise_05_XuatNguocSo {

//	Nhập một số nguyên dương n. Xuất ra số ngược
//	lại. Ví dụ: Nhập 1706 -> Xuất 6071.

	public static void main(String[] args) {
		System.out.println("--------Exercise_05--------");
		System.out.println("Input n: ");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		do {
			int separateNumber = number % 10;
			System.out.print(separateNumber);
			number /= 10;
		} while (number > 0);
	}

}