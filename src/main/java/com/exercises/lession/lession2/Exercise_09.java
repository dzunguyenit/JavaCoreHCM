package com.exercises.lession.lession2;

public class Exercise_09 {

	public static void main(String[] args) {

//		Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
//		Cho biết số xe của bạn được mấy nút?

		int numberMotorbike = 12345;

		int sotachra;

		int i = 1;

		int sum = 0;

		while (i <= 5) {
			sotachra = numberMotorbike % 10;
			sum += sotachra;
			numberMotorbike /= 10;
			i++;

		}

		System.out.println("Sum = " + sum);
		System.out.println("Số nút = " + sum % 10);

	}

}
