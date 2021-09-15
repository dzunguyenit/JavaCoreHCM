package com.exercises.lession.lession14.entities;

import java.util.Scanner;

public class Circle extends Shape {
	// Hình tròn: trung-tâm, bán-kính

	private Point center;
	private int radius;

	public Circle() {
	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Circle {");
		sb.append("center = ").append(center.toString());
		sb.append(", radius=").append(radius);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public void fromConsole(Scanner sc) {
		System.out.println("Hình tròn: ");
		System.out.println("Tọa độ tâm: ");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		this.center = new Point(x, y);

		System.out.print("Bán kính = ");
		this.radius = sc.nextInt();
	}
}
