package com.exercises.lession.lession14.entities;

import java.util.Scanner;

public class Triangle extends Shape {
	// Hình tam giác: 3 điểm

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle() {
	}

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Triangle {");
		sb.append("p1 = ").append(p1.toString()).append(',' + " ");
		sb.append("p2 = ").append(p2.toString()).append(',' + " ");
		sb.append("p3 = ").append(p3.toString());
		sb.append('}');
		return sb.toString();
	}

	@Override
	public double calculateArea() {
		return (double) 1 / 2 * Math.abs((this.p2.getX() - this.p1.getX()) * (this.p3.getY() - this.p1.getY())
				- (this.p3.getX() - this.p1.getX()) * (this.p2.getY() - this.p1.getY()));
	}

	@Override
	public void fromConsole(Scanner sc) {
		System.out.println("Hình tam giác: ");
		System.out.println("Nhập vào tọa độ 3 điểm của tam giác: ");

		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		this.p1 = new Point(x1, y1);

		System.out.print("x2 = ");
		int x2 = sc.nextInt();
		System.out.print("y2 = ");
		int y2 = sc.nextInt();
		this.p2 = new Point(x2, y2);

		System.out.print("x3 = ");
		int x3 = sc.nextInt();
		System.out.print("y3 = ");
		int y3 = sc.nextInt();
		this.p3 = new Point(x3, y3);

	}

}
