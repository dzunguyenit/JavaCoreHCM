package com.lession.lession18.collection;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		do {
			System.out.println("-------------------");
			System.out.println("1. Print list");
			System.out.println("2. Add new element");
			System.out.println("0. Quit");
			System.out.print("Your command: ");

			Scanner scanner = new Scanner(System.in);
			int command = scanner.nextInt();
			switch (command) {
			case 1:
				System.out.println("PRINT...");
				break;
			case 2:
				System.out.println("ADD ELEMENT...");
				break;
			default:
				System.out.println("Quit...");
				return;
			}
		} while (true);

		// final int CAPACITY = 100;
		//
		// ArrayList<Integer> list = new ArrayList<>(CAPACITY);
		// list.add(10);
		// list.add(20);
		// System.out.println(list.size());
		//
		// ArrayList<Integer> list2 = new ArrayList<>();
		// list2.add(10);
		// list2.add(20);
	}
}
