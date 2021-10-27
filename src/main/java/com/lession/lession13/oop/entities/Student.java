package com.lession.lession13.oop.entities;

public class Student extends Person {

	private float avg;

	public Student() {
	}

	public Student(String name, boolean gender, int age, float avg) {
		super(name, gender, age);
		this.avg = avg;
	}

	public void learn() {
		System.out.println(this.name + " is learning...");
	}

	@Override
	public void sleep() {
		System.out.println(this.name + " sleep 10hrs/day...");
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student {");
		sb.append("name='").append(name).append('\'');
		sb.append(", gender=").append(gender);
		sb.append(", age=").append(age);
		sb.append(", avg=").append(avg);
		sb.append('}');
		return sb.toString();
	}
}
