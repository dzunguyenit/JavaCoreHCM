package com.exercises.lession.lession10.classes;

public class Triangle {

//	 Khai báo kiểu dữ lịêu tam giác (Triangle)
//	 Nhập/Xuất tam giác
//	 Tính chu vi, diện tích tam giác

	@Override
	public String toString() {
		if (isTriangle()) {
			return "(a,b,c) = " + "(" + this.a + "," + this.b + "," + this.c + ")" + "";
		} else {
			return "Khong phai tam giac!";
		}
	}

	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean isTriangle() { // check xem 3 cạnh có tạo thành 1 tam giác không
		if ((this.a + this.b > this.c) && (this.a + this.c > this.b) && (this.b + this.c > this.a)) {
			return true;
		}
		return false;
	}

	public int getCircumference() {
		return this.a + this.b + this.c;
	}

	public double getArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(triangle);

		System.out.printf("Circumference triangle (%d,%d,%d) = %d \n", triangle.getA(), triangle.getB(),
				triangle.getC(), triangle.getCircumference());

		System.out.printf("Area triangle (%d,%d,%d) = %f \n", triangle.getA(), triangle.getB(), triangle.getC(),
				triangle.getArea());
	}
}
