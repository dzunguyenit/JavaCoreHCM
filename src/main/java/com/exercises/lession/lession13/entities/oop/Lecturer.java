package com.exercises.lession.lession13.entities.oop;

public abstract class Lecturer {

	protected String name;
	protected String email;
	protected String address;
	protected String phone;

	public Lecturer() {
	}

	public Lecturer(String name, String email, String address, String phone) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int getSalary();

}