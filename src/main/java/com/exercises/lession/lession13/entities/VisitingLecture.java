package com.exercises.lession.lession13.entities;

public class VisitingLecture extends Lecturer {

//	Thông tin giảng viên thỉnh giảng: tên giảng viên,
//	email, địa chỉ, điện thoại, cơ quan làm việc, số giờ
//	giảng dạy trong tháng

	private String placeToWork;
	private static final int SALARY_IN_HOUR = 200000;

	public VisitingLecture() {
	}

	public VisitingLecture(String name, String email, String address, String phone, int hoursTeachInMonth,
			String placeToWork) {
		super(name, email, address, phone, hoursTeachInMonth);
		this.placeToWork = placeToWork;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("VisitingLecture {");
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
	public int getSalary() {
		return SALARY_IN_HOUR * this.hoursTeachInMonth;
	}

}
