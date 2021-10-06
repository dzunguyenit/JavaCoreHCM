package com.exercises.lession.lession25;

import java.util.Scanner;

public class Triangle extends Shape {
	// Hình tam giác: 3 điểm

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {
	}

	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Triangle {");
		sb.append("p1 = ").append(pointA.toString()).append(',' + " ");
		sb.append("p2 = ").append(pointB.toString()).append(',' + " ");
		sb.append("p3 = ").append(pointC.toString());
		sb.append('}');
		return sb.toString();
	}

	@Override
	public double calculateArea() {
		return (double) 1 / 2
				* Math.abs((this.pointB.getX() - this.pointA.getX()) * (this.pointC.getY() - this.pointA.getY())
						- (this.pointC.getX() - this.pointA.getX()) * (this.pointB.getY() - this.pointA.getY()));
	}

	@Override
	public void fromConsole(Scanner sc) {
		System.out.println("Hình tam giác: ");
		System.out.println("Nhập vào tọa độ 3 điểm của tam giác: ");

		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		this.pointA = new Point(x1, y1);

		System.out.print("x2 = ");
		int x2 = sc.nextInt();
		System.out.print("y2 = ");
		int y2 = sc.nextInt();
		this.pointB = new Point(x2, y2);

		System.out.print("x3 = ");
		int x3 = sc.nextInt();
		System.out.print("y3 = ");
		int y3 = sc.nextInt();
		this.pointC = new Point(x3, y3);

	}

	public double calculatePerimeter(Triangle triangle) {
		triangle = new Triangle(this.pointA, this.pointB, this.pointC);
//		Cho tam giác ABC có A (1;2), B (-3;1), C(2;-5)
//		a) Tính chu vi tam giác ABC
//		b) Tính diện tích tam giác ABC
//		c) Tìm tọa độ tâm đường tròn ngoại tiếp I của tam giác ABC
//		Giải :
//		a) 
//		Ta có:
//		AB = (-4; -1 ) => AB = √17
//		AC = (1; -7) => AC = 5√2
//		BC = (5; - 6) => BC = √61
//		Chu vi tam giac ABC la:
//		P = AB + AC + BC = √17 + 5√2 + √61 = 19,004.

		// AB
		int pointX_AB = this.pointB.getY() - this.pointA.getY();
		int pointY_AB = this.pointB.getX() - this.pointA.getX();
		Point pointAB = new Point(pointX_AB, pointY_AB);

		// BC
		int pointX_BC = this.pointC.getY() - this.pointB.getY();
		int pointY_BC = this.pointC.getX() - this.pointB.getX();
		Point pointBC = new Point(pointX_BC, pointY_BC);

		// CA
		int pointX_CA = this.pointA.getY() - this.pointC.getY();
		int pointY_CA = this.pointA.getX() - this.pointC.getX();
		Point pointCA = new Point(pointX_CA, pointY_CA);

		double sqrtAB = Math.sqrt(pointAB.getX() * pointAB.getX() + pointAB.getY() * pointAB.getY());
		double sqrtBC = Math.sqrt(pointBC.getX() * pointBC.getX() + pointBC.getY() * pointBC.getY());
		double sqrtCA = Math.sqrt(pointCA.getX() * pointCA.getX() + pointCA.getY() * pointCA.getY());

		return sqrtAB + sqrtBC + sqrtCA;
	}

}
