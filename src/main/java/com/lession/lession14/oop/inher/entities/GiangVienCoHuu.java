package com.lession.lession14.oop.inher.entities;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
	private int luong, soGioDayToiThieu;

	public GiangVienCoHuu() {
	}

	public GiangVienCoHuu(String ten, String email, String diaChi, String dienThoai, int soGioDay, int luong,
			int soGioDayToiThieu) {
		super(ten, email, diaChi, dienThoai, soGioDay);
		this.luong = luong;
		this.soGioDayToiThieu = soGioDayToiThieu;
	}

	@Override
	public void fromConsole(Scanner sc) {
		super.fromConsole(sc);

		System.out.print("- Lương: ");
		this.luong = Integer.parseInt(sc.nextLine());

		System.out.print("- Số giờ dạy tối thiểu: ");
		this.soGioDayToiThieu = Integer.parseInt(sc.nextLine());
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("GiangVienCoHuu {");
		this.getGVString(sb);
		sb.append(", luong=").append(String.format("%,d", luong));
		sb.append(", soGioDayToiThieu=").append(soGioDayToiThieu);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public int tinhLuong() {
		final int luongNgoaiGio = 200000;
		int bonus = this.soGioDay > this.soGioDayToiThieu ? (this.soGioDay - this.soGioDayToiThieu) * luongNgoaiGio : 0;
		return this.luong + bonus;
	}
}