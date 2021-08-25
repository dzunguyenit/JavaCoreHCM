package com.exercises.lession.lession9;

public class Exercise_01 {

//	Nhập vào int ngày, int tháng, int năm, int giờ, int phút, int giây: phát sinh ra timestamp (giây).
//	Nhập vào timestamp (giây): phát sinh ra ngày, tháng, năm, giờ, phút, giây.
//
//	1. Không dùng class hỗ trợ ngày, tháng, năm, chỉ dùng if, for, while bình dân.
//	2. Dùng các class hỗ trợ ngày, tháng, năm.
//	
//	1. Viết hàm xét năm nhuận.
//	2. Viết hàm lấy số giây 1 tháng/năm bất kỳ.
//	3. Viết hàm lấy số giây của 1 năm bất kỳ.
//	4. Viết hàm tính số giây từ ngày 1 đến ngày đang xét.

	final public static long DAY_IN_SECOND = 24 * 3600;
	final public static long HOUR_IN_SECOND = 3600;
	final public static int DAY = 1;
	final public static int MONTH = 1;
	final public static int YEAR = 1970;

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	public static long getNumberOfDayFromMonthYear(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29 : 28;
		default:
			return -1;
		}
	}

	public static long getNumberOfSecondFromMonthYear(int month, int year) {
		return getNumberOfDayFromMonthYear(month, year) * DAY_IN_SECOND;
	}

	public static long getNumberOfSecondFromYear(int year) {
		return (isLeapYear(year) ? 366 : 365) * DAY_IN_SECOND;
	}

	public static long getUnixTimeFromYear(int year) {
		long seconds = 0;

		for (int y = 1970; y <= year; y++)
			seconds += getNumberOfSecondFromYear(y);

		long timestamp = seconds - 1;
		return timestamp;
	}

	public static long getUnixTimeFromMonthYear(int month, int year) {
		long seconds = 0;

		for (int y = 1970; y <= year - 1; y++)
			seconds += getNumberOfSecondFromYear(y);

		for (int m = 1; m <= month; m++)
			seconds += getNumberOfSecondFromMonthYear(m, year);

		long timestamp = seconds - 1;
		return timestamp;
	}

	// DATE TO TIMESTAMP
	public static long getUnixTimeFromDate(int day, int month, int year, int hour, int min, int sec) {
		long seconds = 0;

		for (int y = YEAR; y <= year - 1; y++)
			seconds += getNumberOfSecondFromYear(y);

		for (int m = 1; m <= month - 1; m++)
			seconds += getNumberOfSecondFromMonthYear(m, year);

		seconds += (day - 1) * DAY_IN_SECOND;

		for (int h = 0; h <= hour - 1; h++) {
			seconds += HOUR_IN_SECOND;
		}

		for (int m = 0; m <= min - 1; m++) {
			seconds += 60;
		}
		seconds += sec;
		return seconds;
	}

	// TIMESTAMP TO DATE
	public static int[] getDateFromUnixTime(long timestamp) {
		int day = DAY;
		int month = MONTH;
		int year = YEAR;

		int hour = 0;
		int min = 0;
		int sec = 0;

		while (timestamp >= getNumberOfSecondFromYear(year)) {
			timestamp -= getNumberOfSecondFromYear(year);
			year++;
		}

		while (timestamp >= getNumberOfSecondFromMonthYear(month, year)) {
			timestamp -= getNumberOfSecondFromMonthYear(month, year);
			month++;
		}

		while (timestamp >= DAY_IN_SECOND) {
			timestamp -= DAY_IN_SECOND;
			day++;
		}

		while (timestamp >= HOUR_IN_SECOND) {
			timestamp -= HOUR_IN_SECOND;
			hour++;
		}

		while (timestamp >= 60) {
			timestamp -= 60;
			min++;
		}

		sec += timestamp;

		return new int[] { day, month, year, hour, min, sec };

	}

	public static void main(String[] args) {

		long timestamp = Exercise_01.getUnixTimeFromDate(21, 8, 2021, 1, 2, 3);
		System.out.println(timestamp);

		int[] date = Exercise_01.getDateFromUnixTime(timestamp);
		System.out.format("%d/%d/%d %d:%d:%d", date[0], date[1], date[2], date[3], date[4], date[5]);
		System.out.println("\n===================\n");

		timestamp = Exercise_01.getUnixTimeFromDate(15, 1, 1999, 7, 8, 9);
		System.out.println(timestamp);
		date = Exercise_01.getDateFromUnixTime(timestamp);
		System.out.format("%d/%d/%d %d:%d:%d", date[0], date[1], date[2], date[3], date[4], date[5]);
		System.out.println("\n===================\n");

		timestamp = Exercise_01.getUnixTimeFromDate(30, 12, 2001, 7, 8, 59);
		System.out.println(timestamp);
		date = Exercise_01.getDateFromUnixTime(timestamp);
		System.out.format("%d/%d/%d %d:%d:%d", date[0], date[1], date[2], date[3], date[4], date[5]);
		System.out.println("\n===================\n");

	}
}
