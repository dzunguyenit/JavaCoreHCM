package com.exercises.lession.lession13.entities;

public abstract class Lecturer {

	protected String name;
	protected String email;
	protected String address;
	protected String phone;
	protected int hoursTeachInMonth;

	public Lecturer() {
	}

	public Lecturer(String name, String email, String address, String phone, int hoursTeachInMonth) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.hoursTeachInMonth = hoursTeachInMonth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getSalary();

}