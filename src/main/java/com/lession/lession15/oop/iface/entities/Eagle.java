package com.lession.lession15.oop.iface.entities;

public class Eagle implements IEatable, IFlyable {
	@Override
	public void eat() {
		System.out.println("Eagle eating...");
	}

	@Override
	public void fly() {
		System.out.println("Eagle flying...");
	}

	@Override
	public void sleep() {
		System.out.println("Eagle sleeping...");
	}
}
