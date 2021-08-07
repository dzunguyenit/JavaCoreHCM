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

		int day;
		switch (month) {
		case 1: {
			day = 1;
			break;
		}
		case 2: {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				day = 28;
			} else
				day = 29;
			break;
		}
		case 3: {
			day = 31;
			break;
		}
		case 4: {
			day = 30;
			break;
		}
		case 5: {
			day = 31;
			break;
		}
		case 6: {
			day = 30;
			break;
		}
		case 7: {
			day = 31;
			break;
		}
		case 8: {
			day = 31;
			break;
		}
		case 9: {
			day = 30;
			break;
		}
		case 10: {
			day = 31;
			break;
		}
		case 11: {
			day = 30;
			break;
		}
		case 12: {
			day = 31;
			break;
		}
		default: {
			day = 0;
			break;
		}
		}
		return day;
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