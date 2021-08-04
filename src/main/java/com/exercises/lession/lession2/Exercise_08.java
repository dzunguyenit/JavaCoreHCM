package com.exercises.lession.lession2;

public class Exercise_08 {

	public static void main(String[] args) {

//		Nhập bán kính của đường tròn. Tính chu vi và
//		diện tích của hình tròn đó.

		final float PI = 3.14f;

		int radius = 20;

		float circumference = 2 * radius * PI;
		float area = PI * radius * radius;

		System.out.println("Circumference = 2 * " + radius + " * " + PI + " = " + circumference);
		System.out.println("Area = " + PI + " * " + radius + " * " + radius + " = " + area);

	}

}
