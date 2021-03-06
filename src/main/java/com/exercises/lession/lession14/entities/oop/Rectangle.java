package com.exercises.lession.lession14.entities.oop;

import java.util.Scanner;

public class Rectangle extends Shape {
//Hình chữ nhật: điểm-trái-trên, chiều-dài, chiều-rộng

	private Point topLeft;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(Point topLeft, int width, int height) {
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Rectangle {");
		sb.append("topLeft=").append(topLeft.toString());
		sb.append(", width=").append(width);
		sb.append(", height=").append(height);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public double calculateArea() {
		return this.height * this.width;
	}

	@Override
	public void fromConsole(Scanner sc) {
		System.out.println("Hình chữ nhật: ");
		System.out.println("Tọa độ điểm trái trên: ");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		this.topLeft = new Point(x, y);

		System.out.print("Chiều dài: ");
		this.height = sc.nextInt();
		System.out.print("Chiều rộng: ");
		this.width = sc.nextInt();

	}

}
