package com.exercises.lession.lession2.javabasic;

public class Exercise_10_Min_Max_HaiSo {

	public static void main(String[] args) {

//		10.Nhập vào 2 số nguyên.
//		Tính min và max của hai số đó.

		int a = 123;
		int b = 456;

		int min = (a <= b) ? a : b;

		int max = (a >= b) ? a : b;

		System.out.println("Min = " + min);
		System.out.println("Max = " + max);

	}
}