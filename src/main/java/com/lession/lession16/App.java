package com.lession.lession16;

import java.io.IOException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int age = scanner.nextInt();
		if (age < 18)
			throw new AgeCheckingException("");

		// generateException();

		// try {
		// generateException();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		try {
			System.out.print("a = ");
			int a = Integer.parseInt(scanner.nextLine());
			System.out.print("b = ");
			int b = Integer.parseInt(scanner.nextLine());

			int n = a / b;
			System.out.println(n);

			throw new IOException("IO");
		} catch (ArithmeticException e1) {
			System.out.println("/ 0");
		} catch (NumberFormatException e2) {
			System.out.println("invalid format");
		} catch (Exception e3) {
			e3.printStackTrace();
		}

		// catch (Exception e) {
		// // e.printStackTrace();
		// // System.out.println(e);
		//
		// if (e instanceof ArithmeticException) {
		// System.out.println("/ 0");
		// }
		//
		// if (e instanceof NumberFormatException) {
		// System.out.println("invalid format");
		// }
		// }

		// ArrayList list = null;
		// list.clear();

		// int[] arr = new int[5];
		// System.out.println(arr[10]);

		System.out.println("Finish!");
	}

	public static void generateException() throws IOException {
		throw new IOException("Bug");
	}

	public static void genExc() {
		try {
			throw new IOException("");
		} catch (IOException e) {

		}
	}
}
