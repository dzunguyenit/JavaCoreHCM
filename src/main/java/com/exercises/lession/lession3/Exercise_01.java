package com.exercises.lession.lession3;

import java.util.Scanner;

public class Exercise_01 {

	// Bài tập cấu trúc điều kiện về nhà
	// Bài 1;
	// Viết chương trình xét 1 năm có phải là năm nhuận hay không?
	public void isLeapYear() {
		Scanner scanner = new Scanner(System.in);
		int year;

		System.out.println("Input year: ");
		year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d is leap year", year);
		} else {
			System.out.printf("%d is not leap year", year);
		}

	}
	// Bài 2;
	// Cho ngày tháng năm
	// Xét xem ngày tháng năm có hợp lệ hay không
	// Tính toán ngày sau đó 1 ngày
	// Tính toán ngày trước đó 1 ngày

	public int getDay(int month, int year) {
		if (month > 12 || month < 1)
			return 0;
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month == 2)
			return 29;
		else
			return 28;
	}

	public void checkDay() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input day: ");
		int day = scanner.nextInt();
		System.out.print("Input month: ");
		int month = scanner.nextInt();
		System.out.print("Input year: ");
		int year = scanner.nextInt();

		if (getDay(month, year) == 0)
			System.out.printf("Day: " + day + "/" + month + "/" + year + " is not valid");
		else if (day > 0 && day <= getDay(month, year)) {
			System.out.println(day + "/" + month + "/" + year + " is valid");
			previousDay(day, month, year);
			nextDay(day, month, year);
		}
	}

	private void previousDay(int day, int month, int year) {
		if (day == 1) {
			if (month == 1) {
				year -= 1;
				month = 12;
			} else {
				month -= 1;
			}
			day = getDay(month, year);
		} else {
			day -= 1;
		}
		System.out.println("Previous day: " + day + "/" + month + "/" + year);
	}

	private void nextDay(int day, int month, int year) {
		if (day == getDay(month, year)) {
			day = 1;
			if (month == 12) {
				year += 1;
				month = 1;
			} else {
				month += 1;
			}
		} else
			day += 1;
		System.out.println("Next day: " + day + "/" + month + "/" + year);
	}

	public static void main(String[] args) {
		Exercise_01 exercise_01 = new Exercise_01();

		System.out.println("--------Exercise_01--------");
		exercise_01.isLeapYear();

		System.out.println("--------Exercise_02--------");
		exercise_01.checkDay();

	}
}