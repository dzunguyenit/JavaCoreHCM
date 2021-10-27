package com.lession.lession15.oop.iface.entities;

public class Pegasus implements IRunnable, IFlyable, IEatable {
	@Override
	public void eat() {
		System.out.println("Pegasus eating...");
	}

	@Override
	public void fly() {
		System.out.println("Pegasus flying...");
	}

	@Override
	public void run() {
		System.out.println("Pegasus running...");
	}

	@Override
	public void sleep() {
		System.out.println("Pegasus sleeping like a horse...");
	}
}
