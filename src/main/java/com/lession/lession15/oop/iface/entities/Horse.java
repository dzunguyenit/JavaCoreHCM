package com.lession.lession15.oop.iface.entities;

public class Horse implements IRunnable, IEatable {

	@Override
	public void eat() {
		System.out.println("Horse eating...");
	}

	@Override
	public void run() {
		System.out.println("Horse running...");
	}

	@Override
	public void sleep() {
		System.out.println("Horse sleeping...");
	}
}
