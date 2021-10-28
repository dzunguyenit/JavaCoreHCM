package com.exercises.lession.lession2.javabasic;

public class Exercise_05_Tong_Hieu_Tich_Thuong {

	public static void main(String[] args) {

//		Nhập 2 số a và b.
//		Tính tổng, hiệu, tính và thương của hai số đó.

		int addition, subtraction, multiplication;
		float division;

		int a = 10;
		int b = 6;

		addition = a + b;
		subtraction = a - b;
		multiplication = a * b;
		division = ((float) a) / b;

		System.out.println(a + " + " + b + " = " + addition);
		System.out.println(a + " - " + b + " = " + subtraction);
		System.out.println(a + " * " + b + " = " + multiplication);
		System.out.println(a + " / " + b + " = " + division);

	}

}
