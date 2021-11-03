package com.exercises.lession.bonus.java8.passenger;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
//	Nhập vào 1 danh sách n hành khách (n nhập từ bàn phím). Hiển thị danh sách
//	hành khách và số tiền phải trả tương ứng của mỗi khách hàng. Sắp xếp danh
//	sách hành khách theo chiều giảm dần của Tổng tiền. Hiển thị lại danh sách
//	hành khách và số tiền phải trả tương ứng của mỗi khách hàng.

	public static void sortPassengerByAmmountDescending(Passenger[] passengers) {
		Passenger temp = passengers[0];

		for (int i = 0; i < passengers.length - 1; i++) {
			for (int j = i + 1; j < passengers.length; j++) {
				if (passengers[i].tinhTongTien() < passengers[j].tinhTongTien()) {
					temp = passengers[j];
					passengers[j] = passengers[i];
					passengers[i] = temp;
				}
			}
		}
		System.out.println("Order by passenger descending");
		for (int i = 0; i < passengers.length; i++) {
			System.out.println("Passenger " + (i + 1) + ":");
			System.out.println(passengers[i].toString());
		}
	}

	public static void main(String[] args) {

		Ticket ticket01 = new Ticket("Chuyen_So_01", LocalDateTime.of(2010, Month.JANUARY, 1, 1, 1), 10000);
		Ticket ticket02 = new Ticket("Chuyen_So_02", LocalDateTime.of(2011, Month.FEBRUARY, 2, 2, 2), 20000);
		Ticket ticket03 = new Ticket("Chuyen_So_03", LocalDateTime.of(2012, Month.MARCH, 3, 3, 3), 30000);
		Ticket ticket04 = new Ticket("Chuyen_So_04", LocalDateTime.of(2013, Month.APRIL, 4, 4, 4), 40000);
		Ticket ticket05 = new Ticket("Chuyen_So_05", LocalDateTime.of(2014, Month.MAY, 5, 5, 5), 50000);
		Ticket ticket06 = new Ticket("Chuyen_So_06", LocalDateTime.of(2015, Month.JUNE, 6, 6, 6), 60000);

		List<Ticket> listTicket_01 = Arrays.asList(ticket01, ticket02);
		List<Ticket> listTicket_02 = Arrays.asList(ticket03, ticket04);
		List<Ticket> listTicket_03 = Arrays.asList(ticket05, ticket06);

		Passenger passenger01 = new Passenger("VuNguyen001", true, 1, listTicket_01);
		Passenger passenger03 = new Passenger("VanNguyen002", false, 2, listTicket_02);
		Passenger passenger02 = new Passenger("LanNguyen003", false, 3, listTicket_03);

		System.out.println("====================================");
		System.out.println("1) Hiển thị danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.");
		System.out.println("====================================");

		List<Passenger> listPassenger = Arrays.asList(passenger01, passenger02, passenger03);
		for (int i = 0; i < listPassenger.size(); i++) {
			System.out.println(listPassenger.get(i).toString());
			System.out.println("Total bill: " + listPassenger.get(i).tinhTongTien());
			System.out.println("\n====================================");
		}

//		
		System.out.println("2) Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.");
		System.out.println("=====================================");

		List<Passenger> listDescendingPassenger = listPassenger.stream()
				.sorted(Comparator.comparingInt(Passenger::tinhTongTien).reversed()).collect(Collectors.toList());

		for (Passenger passenger : listDescendingPassenger) {
			System.out.println(passenger + "Tổng tiền: " + passenger.tinhTongTien());
		}

		System.out.println("=======================================================");
		System.out.println("3) Hiển thị lại danh sách hành khách và số tiền phải trả tương ứng của mỗi khách hàng.");
		for (Passenger passenger : listPassenger) {
			System.out.println(passenger);
		}

	}
}