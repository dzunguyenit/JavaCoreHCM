package com.exercises.lession.lession25;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape triangle = new Triangle();
		triangle.fromConsole(sc);

		double total = 0;
		total += triangle.calculateArea();

		int pricePerUnit = 1000;
		System.out.format("Total = %f\n", total * pricePerUnit);

	}
}
