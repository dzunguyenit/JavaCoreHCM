package com.exercises.lession.lession14.entities;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		Shape circle = new Circle(new Point(3, 4), 5);
		System.out.println(circle);

		Shape rectangle = new Rectangle(new Point(3, 4), 5, 6);
		System.out.println(rectangle);

		Shape square = new Square(new Point(5, 6), 8);
		System.out.println(square);

		Shape triangle = new Triangle(new Point(1, 2), new Point(3, 4), new Point(5, 6));
		System.out.println(triangle);

		List<Shape> listShape = new ArrayList<>();

		listShape.add(circle);
		listShape.add(rectangle);
		listShape.add(square);
		listShape.add(triangle);

		double pricePerUnit = 100;

		double total = 0;
		for (Shape s : listShape) {
			total += pricePerUnit * s.calculateArea();
		}

		System.out.println("Total pay for realstate is = " + total);
	}
}
