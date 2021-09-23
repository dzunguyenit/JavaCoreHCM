package com.lession.lession16.solution;

import java.util.Scanner;

import com.exercises.lession.lession16.exeption.BMI;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int w, h;
		try {
			System.out.print("w = ");
			w = Integer.parseInt(scanner.nextLine());
			System.out.print("h = ");
			h = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println(e);
			return;
		}

		try {
			double bmi = BMI.calculateBMI(w, h);
			System.out.format("BMI = %f\n", bmi);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
