package com.exercises.lession.lession16.exeption;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

//		Xây dựng chương trình tính BMI đơn giản
//		Công thức: bmi = weight/height2
//		Đoạn hàm tính bmi cần được tách riêng thành một function, bao gồm phần tính bmi và kiểm tra tính đúng đắn của các tham số đầu vào
//		
//		Hàm main() sẽ bắt tất cả các exception có thể có của toàn bộ chương trình và hiển thị thông báo phù hợp

		Scanner scanner = new Scanner(System.in);
		System.out.print("Weight = ");

		int weight = scanner.nextInt();

		if (weight <= 0)
			throw new BMICheckingException("Weight <= 0 is invalid number");

		System.out.print("Height = ");
		int height = scanner.nextInt();

		if (height < 0)
			throw new BMICheckingException("Height < 0 is invalid number");

		try {

			double bmi = calculateBMI(weight, height);
			System.out.println("BMI = " + bmi);

			if (bmi < 18.5) {
				System.out.println("Thin");
			} else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("Normal");
			} else if (bmi >= 25 && bmi < 30) {
				System.out.println("Overweight");
			} else if (bmi >= 30 && bmi < 35) {
				System.out.println("Overweight type 1");
			} else if (bmi >= 35 && bmi < 40) {
				System.out.println("Overweight type 2");
			} else {
				System.out.println("Overweight type 3");
			}
		} catch (ArithmeticException e1) {
			System.out.println("/ 0");
		} catch (Exception e3) {
			e3.printStackTrace();
		}

		System.out.println("Finish!");
	}

	public static double calculateBMI(int weight, int height) {
		if (height == 0)
			throw new BMICheckingException("Weight = 0 is invalid number");
		double heightMeter = ((double) (height / 100.0));
		return ((double) weight) / (heightMeter * heightMeter);
	}
}
