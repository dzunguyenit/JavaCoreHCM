package com.exercises.lession.bonus.java8.passenger;

import java.util.List;
import java.util.stream.Collectors;

public class Passenger {

//	Thuộc tính: hoTen, gioiTinh, tuoi, danhSachVe
//	Phương thức:
//	Khởi tạo
//	Nhập thông tin hành khách từ console
//	Xuất thông tin
//	tinhTongTien(): trả về tổng số tiền phải trả của hành khách ứng với số vé đã mua
//	Chương trình chính
//	Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím).
//	Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.
//	Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
//	Hiển thị lại danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.

	String hoTen;;
	boolean gioiTinh;
	int tuoi;
	List<Ticket> listTicket;

	public Passenger() {
	}

	public Passenger(String hoTen, boolean gioiTinh, int tuoi, List<Ticket> listTicket) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.listTicket = listTicket;
	}

	@Override
	public String toString() {
		String genderToString = (this.gioiTinh == true) ? "Nam" : "Nữ";
		String passengerInfor = "\nPassenger Information:\n\nName: " + this.hoTen + ", Gender: " + genderToString
				+ ", Age: " + this.tuoi + "\n\nTicket Information:\n\n";

		for (Ticket ticket : listTicket) {
			passengerInfor += ticket.toString() + "\n";
		}

		return passengerInfor;

	}

	public int tinhTongTien() {
		return listTicket.stream().map(x -> x.getGiaVe()).collect(Collectors.summingInt(Integer::intValue));
	}

}
