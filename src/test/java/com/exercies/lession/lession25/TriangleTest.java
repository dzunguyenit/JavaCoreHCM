package com.exercies.lession.lession25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.exercises.lession.lession25.oop.Point;
import com.exercises.lession.lession25.oop.Shape;
import com.exercises.lession.lession25.oop.Triangle;

@DisplayName("Triangle Class Unit-Test Cases")
class TriangleTest {

	// Unit test hàm tính khoảng cách điểm A đế B
	@Test
	@DisplayName("Check function Distance")
	void checkFunctionDistance() {
		Point pointA = new Point(1, 2);
		Point pointB = new Point(3, 4);
		double distanceAB = pointA.calculateDistance(pointA, pointB);
		
		double actual = 2.8284271247461903;
		assertEquals(distanceAB, actual);
	}

	// Unit test hàm tính chu vi tam giác
	@Test
	@DisplayName("Check function CalculatePerimeter")
	void checkFunctionCalculatePerimeter() {
		Triangle triangle = new Triangle(new Point(0, 2), new Point(-3, 1), new Point(2, -5));
		double perimeter = triangle.calculatePerimeter(triangle);

		double actual = 18.252637225355553;
		assertEquals(perimeter, actual);
	}

	// Unit test hàm tính diện tích tam giác
	@Test
	@DisplayName("Check function CalculateArea")
	void checkFunctionCalculateArea() {
		Shape triangle = new Triangle(new Point(2, 4), new Point(1, 2), new Point(6, 2));
		double actual = 5.0;
		assertEquals(triangle.calculateArea(), actual);
	}

}