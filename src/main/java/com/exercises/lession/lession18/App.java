package com.exercises.lession.lession18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// Xây dựng chương trình cho phép người dùng chọn các chức năng sau:
		// – Nhập vào danh sách các phân số, sau đó cho phép
		// – Xuất danh sách phân số
		// – Thêm phân số
		// – Xóa phân số tại vị trí thứ k
		// – Cập nhật phân số tại vị trí thứ k
		// – Tìm các phân số có giá trị lớn nhất
		// – Xóa tất cả các phân số

		System.out.println("-------------------");
		System.out.println("Nhập vào danh sách các phân số, phân cách nhau bằng dấu cách: ");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		List<Fraction> listFraction = getListFractionFromInput(input);

		do {
			System.out.println("---------------------------------");
			System.out.println("Vui lòng chọn: ");
			System.out.println("1. Xuất danh sách phân số");
			System.out.println("2. Thêm phân số");
			System.out.println("3. Xóa phân số tại vị trí thứ k");
			System.out.println("4. Cập nhật phân số tại vị trí thứ k");
			System.out.println("5. Tìm các phân số có giá trị lớn nhất");
			System.out.println("6. Xóa tất cả các phân số");
			System.out.println("0. Thoát");

			int command = scanner.nextInt();
			switch (command) {
			case 1:
				System.out.println("---------------------------------");
				System.out.println("Xuất danh sách phân số...");
				printOutputFraction(listFraction);
				break;
			case 2:
				System.out.println("---------------------------------");
				System.out.println("Thêm phân số...");
				System.out.println("Nhập vào các phân số: ");
				Scanner sc = new Scanner(System.in);
				String inputFraction = sc.nextLine();
				List<Fraction> listNewFraction = getListFractionFromInput(inputFraction);
				listFraction.addAll(listNewFraction);
				break;
			case 3:
				System.out.println("---------------------------------");
				System.out.println("Xóa phân số tại vị trí thứ: ");
				System.out.println("Nhập vào trị trí K cần xoá: ");
				Scanner scan = new Scanner(System.in);
				String postionDelete = scan.nextLine();
				listFraction.remove(Integer.parseInt(postionDelete));
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("Cập nhật phân số tại vị trí thứ: ");
				System.out.println("Nhập vào trị trí K cần cập nhật: ");
				Scanner scann = new Scanner(System.in);
				String postionUpdate = scann.nextLine();
				System.out.println("Nhập phân số cần cập nhật: ");
				String valueUpdateFraction = scann.nextLine();
				Fraction fractionInput = getFractionFromInput(valueUpdateFraction);
				listFraction.set(Integer.parseInt(postionUpdate), fractionInput);
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("Phân số có giá trị lớn nhất: ");
				Fraction maxFraction = getMaxFraction(listFraction);
				System.out.println(maxFraction);
				break;
			case 6:
				System.out.println("---------------------------------");
				System.out.println("Xóa tất cả các phân số: ");
				listFraction.clear();
				break;
			case 0:
				System.out.println("---------------------------------");
				System.out.println("Thoát chương trình...");
				return;
			}
		} while (true);

	}

	public static List<Fraction> getListFractionFromInput(String input) {
		List<Fraction> listFraction = new ArrayList<Fraction>();
		String[] fractionArray = input.split("\s+");

		List<String> list = Arrays.asList(fractionArray);

		for (String string : list) {
			String[] fr = string.split("/");

			int numerator = Integer.parseInt(fr[0]);
			int denominator = Integer.parseInt(fr[1]);

			Fraction fraction = new Fraction(numerator, denominator);
			listFraction.add(fraction);
		}
		return listFraction;
	}

	public static Fraction getFractionFromInput(String input) {
		String[] fr = input.split("/");
		int numerator = Integer.parseInt(fr[0]);
		int denominator = Integer.parseInt(fr[1]);
		return new Fraction(numerator, denominator);

	}

	public static void printOutputFraction(List<Fraction> listFraction) {
		if (!listFraction.isEmpty()) {
			for (Fraction fraction : listFraction) {
				System.out.println(fraction);
			}
		} else
			System.out.println("Danh sách phân số rỗng");

	}

	public static Fraction getMaxFraction(List<Fraction> listFraction) {
		Fraction max = listFraction.get(0);
		for (int i = 0; i < listFraction.size(); i++) {
			Fraction fractionTemp = max.subtractFraction(listFraction.get(i), max);
			if (fractionTemp.getNumerator() * fractionTemp.getDenominator() > 0) {
				max = listFraction.get(i);
			}
		}
		return max;
	}

}
