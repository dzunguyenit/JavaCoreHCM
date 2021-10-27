package com.exercises.lession.lession3.ifelse;

import java.util.Scanner;

public class Exercise_02 {

//	  Bài 1: Nhập một số bất kỳ. Hãy đọc giá trị của số nguyên đó nếu nó có giá trị
//	  từ 1 đến 9, ngượclại thông báo không đọc được.

	public void readNumber() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input number: ");
		int number = scanner.nextInt();

		if (number >= 1 && number <= 9) {
			System.out.println("Value is: " + number);
		} else {
			System.out.println("Can't read");
		}
	}

	// Bài 2 - Nhập một chữ cái. Nếu là chữ thường thì đổi sang chữ hoa, ngược lại
	// đổi sang chữ thường
	public void changeCharacters() {
		System.out.println("Input 1 character: ");
		Scanner scanner = new Scanner(System.in);
		String character = scanner.nextLine();
		char c = character.charAt(0);
		if (Character.isUpperCase(c) == true) {
			System.out.println("Lowercase word: " + character.toLowerCase());
		} else {
			character.toUpperCase();
			System.out.println("Uppercase word: " + character.toUpperCase());
		}

	}

	// Bài 3: Giải PT bậc nhất ax + b = 0
	public void linearQuation(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else
			System.out.println("Phương trình có nghiệm = " + ((-b) / (float) a));
	}

	// Bài 4: Giải PT bậc 2 ax2 + bx + c = 0
	public void quadraticEquation(float a, float b, float c) {
		if (a != 0) {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta > 0) {
				float x1 = (float) ((-b + Math.sqrt(delta)) / 2 * a);
				float x2 = (float) ((-b - Math.sqrt(delta)) / 2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2);
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
			}
		}
	}

	// Bài 5: Nhập 4 số nguyên a, b, c và d. Tìm số có giá trị nhỏ nhất (min).
	public void min() {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("Input a: ");
		a = scanner.nextInt();
		System.out.println("Input b: ");
		b = scanner.nextInt();
		System.out.println("Input c: ");
		c = scanner.nextInt();
		System.out.println("Input d: ");
		d = scanner.nextInt();

		int min = a;
		if (min > b) {
			min = b;
		}
		if (min >= c) {
			min = c;
		}
		if (min >= d) {
			min = d;
		}
		System.out.println("Min = " + min);
	}

//	Bài 6: Nhập 4 số nguyên a, b, c và d. Hãy sắp xếp giá trị
//	của 4 số nguyên này theo thứ tự tăng dần.
	public void sortAscending() {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("Input a: ");
		a = scanner.nextInt();
		System.out.println("Input b: ");
		b = scanner.nextInt();
		System.out.println("Input c: ");
		c = scanner.nextInt();
		System.out.println("Input d: ");
		d = scanner.nextInt();

		int[] array = new int[] { a, b, c, d };
		int temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

//		Bài 7: Tính tiền đi taxi từ số km nhập vào. Biết:
//		a. 1 km đầu giá 15000đ
//		b. Từ km thứ 2 đến km thứ 5 giá 13500đ
//		c. Từ km thứ 6 trở đi giá 11000đ
//		d. Nếu trên 120km được giảm 10% tổng tiền.

	public void payBillTaxi() {
		Scanner scanner = new Scanner(System.in);
		float km;

		System.out.println("Input number km: ");
		km = scanner.nextInt();
		float money = 0;
		if (km <= 1) {
			money = km * 15000;
		} else if (2.0 <= km && km <= 5.0) {
			money = km * 13500;
		} else if (km >= 6) {
			money = km * 11000;
		} else if (km >= 120) {
			money = (float) (km * 11000 * (1 - 0.1));
		}
		System.out.println("Money = " + money);
	}

	// Bài 8
	// Nhập vào tháng và năm. Cho biết tháng đó có bao nhiêu ngày.
	public void dayOfMonth() {

		Scanner scanner = new Scanner(System.in);
		int month, year;

		System.out.println("Input month: ");
		month = scanner.nextInt();
		System.out.println("Input year: ");
		year = scanner.nextInt();

		switch (month) {
		case 1: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 2: {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.printf("Month %d has 29 days", month);
			} else
				System.out.printf("Month %d has 28 days", month);
			break;
		}
		case 3: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 4: {
			System.out.printf("Month %d has 30 days", month);
			break;
		}
		case 5: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 6: {
			System.out.printf("Month %d has 30 days", month);
			break;
		}
		case 7: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 8: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 9: {
			System.out.printf("Month %d has 30 days", month);
			break;
		}
		case 10: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		case 11: {
			System.out.printf("Month %d has 30 days", month);
			break;
		}
		case 12: {
			System.out.printf("Month %d has 31 days", month);
			break;
		}
		default: {
			break;
		}
		}
	}

	// Bài 9 Nhập độ dài 3 cạnh. Kiểm tra đó có phải là tam giác
	// không và là tam giác gì?
	public void isTriangle() {

		Scanner scanner = new Scanner(System.in);
		double a, b, c;

		System.out.println("Input a: ");
		a = scanner.nextDouble();
		System.out.println("Input b: ");
		b = scanner.nextDouble();
		System.out.println("Input c: ");
		c = scanner.nextDouble();

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.print("Đây là tam giác");
			if ((a == b) && (b == c) && (c == a)) {
				System.out.println(" đều!");
			} else if ((a == b) || (b == c) || (c == a)) {
				System.out.println(" cân!");
			} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
				System.out.println(" vuông!");
			} else
				System.out.println(" thường!");
		} else {
			System.out.println("Đây không phải tam giác.");
		}
	}

	public static void main(String[] args) {
		Exercise_02 exercise_02 = new Exercise_02();
		System.out.println("--------Exercise_01--------");
		exercise_02.readNumber();

		System.out.println("--------Exercise_02--------");
		exercise_02.changeCharacters();

		System.out.println("--------Exercise_03--------");
		exercise_02.linearQuation(2, 1);

		System.out.println("--------Exercise_04--------");
		exercise_02.quadraticEquation(1, 2, 1);

		System.out.println("--------Exercise_05--------");
		exercise_02.min();

		System.out.println("--------Exercise_06--------");
		exercise_02.sortAscending();

		System.out.println("--------Exercise_07--------");
		exercise_02.payBillTaxi();

		System.out.println("--------Exercise_08--------");
		exercise_02.dayOfMonth();

		System.out.println("--------Exercise_09--------");
		exercise_02.isTriangle();

	}
}