package com.lession.lession14.entities;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Số giảng viên: ");
		int n = Integer.parseInt(sc.nextLine());

		GiangVien[] list = new GiangVien[n];
		for (int i = 0; i < n; i++) {
			System.out.format("Giảng viên thứ %d\n", i + 1);
			System.out.print("- Loại GV (0. Cơ hữu / 1. Thỉnh giảng): ");
			int type = Integer.parseInt(sc.nextLine());

			if (type == 0) {
				list[i] = new GiangVienCoHuu();
			} else {
				list[i] = new GiangVienThinhGiang();
			}

			list[i].fromConsole(sc);
		}

//		GiangVien[] list = { new GiangVienCoHuu("Vinh", "vinh@", "dcVinh", "dtVinh", 45, 5000000, 40),
//				new GiangVienCoHuu("Tuan", "tuan@", "dcTuan", "dtTuan", 35, 4000000, 35),
//				new GiangVienThinhGiang("Khoa", "khoa@", "dcKhoa", "dtKhoa", 45, "hcmus"), };

		for (GiangVien gv : list) {
			System.out.println(gv);
		}

		// for (GiangVien gv : list) {
		// if (gv instanceof GiangVienCoHuu) {
		// System.out.println(gv);
		// }
		// }

		int total = 0;
		for (GiangVien gv : list) {
			int luong = gv.tinhLuong();
			System.out.println(luong);
			total += luong;
		}
		System.out.format("Tổng lương: %,d\n", total);
	}
}