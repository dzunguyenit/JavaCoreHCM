package com.exercises.lession.lession13.entities;

import java.util.Scanner;

public class VisitingLecture extends Lecturer {

//	Thông tin giảng viên thỉnh giảng: tên giảng viên,
//	email, địa chỉ, điện thoại, cơ quan làm việc, số giờ
//	giảng dạy trong tháng

	private String placeToWork;

	public VisitingLecture() {
	}

	public VisitingLecture(String name, String email, String address, String phone, int hoursTeachInMonth,
			String placeToWork) {
		super(name, email, address, phone, hoursTeachInMonth);
		this.placeToWork = placeToWork;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student {");
		sb.append("name='").append(name).append('\'');
		sb.append(", email=").append(email);
		sb.append(", address=").append(address);
		sb.append(", phone=").append(phone);
		sb.append(", hoursTeachInMonth=").append(hoursTeachInMonth);
		sb.append(", placeToWork=").append(placeToWork);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input place to work: ");
		this.placeToWork = sc.nextLine();
	}
}
