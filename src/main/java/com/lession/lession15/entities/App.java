package com.lession.lession15.entities;

public class App {
	public static void main(String[] args) {
		// IEatable[] list = {
		// new Horse(),
		// new Eagle(),
		// new Pegasus(),
		// };
		//
		// for (IEatable e : list) {
		// e.eat();
		// }

		IRunnable[] list = { new Horse(), new Pegasus(), };

		for (IRunnable e : list) {
			e.run();
			e.sleep();
		}

		// ((IFlyable)list[1]).fly();

		// IFlyable[] list = {
		// new Eagle(),
		// new Pegasus(),
		// };
		//
		// for (IFlyable e : list) {
		// e.fly();
		// e.sleep();
		// }
	}
}
