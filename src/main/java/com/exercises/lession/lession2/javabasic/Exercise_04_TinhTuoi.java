package com.exercises.lession.lession2.javabasic;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercise_04_TinhTuoi {

	public static void main(String[] args) {

//		Nhập năm sinh của một người.
//		Tính tuổi người đó.

		int yearOfBirth = 1993;

		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		int currentYear = calendar.get(Calendar.YEAR);

		int age = currentYear - yearOfBirth;
		System.out.println("I am " + age + " years old");

	}

}
