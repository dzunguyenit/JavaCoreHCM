package com.exercises.lession.lession13.entities;

import java.util.Scanner;

public class ContractLecture extends Lecturer {
//	Thông tin giảng viên cơ hữu: tên giảng viên, email, địa
//	chỉ, điện thoại, số giờ giảng dạy trong tháng, lương
//	thỏa thuận và số giờ quy định chung trong tháng.

	private int salaryContract;
	private int ruleTimeInMonth;

	public ContractLecture() {
	}

	public ContractLecture(String name, String email, String address, String phone, int hoursTeachInMonth,
			int salaryContract, int ruleTimeInMonth) {
		super(name, email, address, phone, hoursTeachInMonth);
		this.salaryContract = salaryContract;
		this.ruleTimeInMonth = ruleTimeInMonth;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input salary contract: ");
		this.salaryContract = sc.nextInt();
		System.out.println("Input salary rule time in month: ");
		this.salaryContract = sc.nextInt();
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Student {");
		sb.append("name='").append(name).append('\'');
		sb.append(", email=").append(email);
		sb.append(", address=").append(address);
		sb.append(", phone=").append(phone);
		sb.append(", hoursTeachInMonth=").append(hoursTeachInMonth);
		sb.append(", salaryContract=").append(salaryContract);
		sb.append(", ruleTimeInMonth=").append(ruleTimeInMonth);
		sb.append('}');
		return sb.toString();
	}
}
