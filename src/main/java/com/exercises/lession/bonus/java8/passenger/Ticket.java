package com.exercises.lession.bonus.java8.passenger;

import java.time.LocalDateTime;

public class Ticket {
//	Lớp Ticket:
//	Thuộc tính: tenChuyen, ngayBay, giaVe
//	Phương thức:
//	Khởi tạo rỗng & khởi tạo đầy đủ
//	Nhập thông tin vé từ console
//	Xuất thông tin vé thành chuỗi (toString)
//	getGiaVe(): hàm trả về giá vé

	String tenChuyen;
	LocalDateTime ngayBay;
	int giaVe;

	public Ticket() {

	}

	public Ticket(String tenChuyen, LocalDateTime ngayBay, int giaVe) {
		this.tenChuyen = tenChuyen;
		this.ngayBay = ngayBay;
		this.giaVe = giaVe;
	}

	@Override
	public String toString() {
		return "Name: " + this.tenChuyen + ", Date: " + this.ngayBay + ", Price: " + this.giaVe + "";
	}

	public int getGiaVe() {
		return giaVe;

	}

}
