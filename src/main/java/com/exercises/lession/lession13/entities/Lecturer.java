package com.exercises.lession.lession13.entities;

import java.util.Scanner;

public class Lecturer {

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

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name: ");
		this.name = sc.nextLine();

		System.out.println("Input email: ");
		this.email = sc.nextLine();

		System.out.println("Input address: ");
		this.address = sc.nextLine();

		System.out.println("Input phone: ");
		this.phone = sc.nextLine();

		System.out.println("Input hours teach in month: ");
		this.hoursTeachInMonth = sc.nextInt();
	}
}