package com.exercises.lession.lession25.oop;

public class Point {

	private int x, y;

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

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(x,y) = (" + this.x + "," + this.y + ")";
	}

	public double calculateDistance(Point pointA, Point pointB) {
		double distancePointX = (pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX());
		double distancePointY = (pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY());
		return Math.sqrt(distancePointX + distancePointY);
	}
}
