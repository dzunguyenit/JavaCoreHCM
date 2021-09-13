package com.exercises.lession.lession14.entities;

import java.util.Scanner;

public class Square extends Shape {
	// Hình vuông: điểm-trái-trên, chiều-rộng

	private Point topLeft;
	private int width;

	public Square() {
	}

	public Square(Point topLeft, int width) {
		this.topLeft = topLeft;
		this.width = width;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Square {");
		sb.append("topLeft='").append(topLeft.toString()).append('\'');
		sb.append(", width=").append(width);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public double calculateArea() {
		return this.width * this.width;
	}

	@Override
	public void fromConsole(Scanner sc) {
		System.out.println("Tọa độ điểm trái trên: ");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		this.topLeft = new Point(x, y);

		System.out.print("Chiều rộng: ");
		this.width = sc.nextInt();
	}

}
