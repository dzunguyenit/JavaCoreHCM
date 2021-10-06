package com.exercies.lession.lession25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.exercises.lession.lession25.Point;
import com.exercises.lession.lession25.Shape;
import com.exercises.lession.lession25.Triangle;

@DisplayName("Triangle Class Unit-Test Cases")
class TriangleTest {

	// Unit test hàm tính diện tích tam giác
	@Test
	@DisplayName("Check function CalculateArea")
	void checkFunctionCalculateArea() {
		Shape triangle = new Triangle(new Point(2, 4), new Point(1, 2), new Point(6, 2));
		double actual = 5.0;
		assertEquals(triangle.calculateArea(), actual);
	}

	// Unit test hàm tính chu vi tam giác
	@Test
	@DisplayName("Check function CalculatePerimeter")
	void checkFunctionCalculatePerimeter() {
		Triangle triangle = new Triangle(new Point(1, 2), new Point(-3, 1), new Point(2, -5));
		double perimeter = triangle.calculatePerimeter(triangle);

		perimeter = Math.round(perimeter * 100) / 100.000d;

		double actual = 19.0;
		assertEquals(perimeter, actual);
	}
}