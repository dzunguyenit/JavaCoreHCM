package com.lession.lession27;

public class Shape {
	private int sides;

	public Shape(int sides) {
		if (sides < 3 || sides == Integer.MAX_VALUE) {
			throw new IllegalArgumentException();
		}

		this.sides = sides;
	}

	public int getSides() {
		return sides;
	}
}
