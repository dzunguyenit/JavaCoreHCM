package com.exercises.lession.lession13.entities;

public class ContractLecture extends Lecturer {
//	Thông tin giảng viên cơ hữu: tên giảng viên, email, địa
//	chỉ, điện thoại, số giờ giảng dạy trong tháng, lương
//	thỏa thuận và số giờ quy định chung trong tháng.

	private int salaryContract;
	private int ruleTimeInMonth;
	private int hoursTeachInMonth;

	public ContractLecture() {
	}

	public ContractLecture(String name, String email, String address, String phone, int hoursTeachInMonth,
			int salaryContract, int ruleTimeInMonth) {
		super(name, email, address, phone);
		this.hoursTeachInMonth = hoursTeachInMonth;
		this.salaryContract = salaryContract;
		this.ruleTimeInMonth = ruleTimeInMonth;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("ContractLecture {");
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

	@Override
	public int getSalary() {
		int salary = 0;
		if (this.hoursTeachInMonth == 40) {
			salary += this.salaryContract;
		} else if (this.hoursTeachInMonth > 40) {
			salary += (hoursTeachInMonth - 40) * this.salaryContract + this.salaryContract;
		}
		return salary;
	}
}
