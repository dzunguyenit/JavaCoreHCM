package com.exercises.lession.lession10;

public class Point {

//	 Điểm trong mặt phẳng Oxy
//	 Khai báo kiểu dữ liệu điểm (Point)
//	 Nhập/Xuất tọa độ điểm
//	 Tính khoảng cách giữa hai điểm
//	 Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
//	 Kiểm tra điểm thuộc phần tư nào?

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance(Point pointA, Point pointB) { // tính khoảng cách 2 điểm A và B
		double result = Math.sqrt(Math.pow((pointB.x - pointA.x), 2) + Math.pow((pointB.y - pointA.y), 2));
		return (double) Math.round(result * 100) / 100;
	}

	public Point getSymmetryPointO(int x, int y) {// điểm đối xứng qua gốc tọa độ O
		Point point = new Point(x, y);
		point.x = -1 * point.x;
		point.y = -1 * point.y;
		return point;
	}

	public Point getSymmetryOx(int x, int y) {// điểm đối xứng qua truc Ox
		Point point = new Point(x, y);
		point.x = point.x;
		point.y = -1 * point.y;
		return point;
	}

	public Point getSymmetryOy(int x, int y) {// điểm đối xứng qua truc Oy
		Point point = new Point(x, y);
		point.x = -1 * point.x;
		point.y = point.y;
		return point;
	}

	public int belongQuadrant() {// đưa ra góc phần tư của điểm, nếu điểm thuộc trục thì trả về 0
		if (this.x > 0 && this.y > 0) {
			return 1;
		} else if (this.x < 0 && this.y > 0) {
			return 2;
		} else if (this.x < 0 && this.y < 0) {
			return 3;
		} else if (this.x > 0 && this.y < 0) {
			return 4;
		} else {
			return 0;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		Point point = new Point(-80, 10);
		System.out.println(point);

//		 Tính khoảng cách giữa hai điểm
		Point pointB = new Point(-10, 20);
		System.out.printf("Distance (%d,%d) and (%d,%d) = ", point.x, point.y, pointB.x, pointB.y);
		System.out.println(point.distance(point, pointB));

//		 Tìm điểm đối xứng qua gốc toạ độ
		System.out.printf("Point (%d,%d): is symmetry O ", point.x, point.y);
		Point pointO = point.getSymmetryPointO(point.getX(), point.getY());
		System.out.println(pointO);

//		 Tìm điểm đối xứng qua gốc trục Ox
		System.out.printf("Point (%d,%d): is symmetry Ox ", point.x, point.y);
		Point pointOy = point.getSymmetryOx(point.getX(), point.getY());
		System.out.println(pointOy);

//		 Tìm điểm đối xứng qua gốc trục Oy
		System.out.printf("Point (%d,%d): is symmetry Oy ", point.x, point.y);
		Point pointOx = point.getSymmetryOy(point.getX(), point.getY());
		System.out.println(pointOx);

		System.out.printf("Point (%d,%d) is belong quadrant: " + point.belongQuadrant(), point.x, point.y);
	}
}
