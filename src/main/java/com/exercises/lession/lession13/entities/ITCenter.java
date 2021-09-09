package com.exercises.lession.lession13.entities;

import java.util.ArrayList;
import java.util.List;

public class ITCenter {
	public static void main(String[] args) {
		Lecturer contractLecture01 = new ContractLecture("Tú", "tunguyen1990@gmailcom", "123 Cộng Hoà", "0988777828",
				40, 100000, 40);
		Lecturer contractLecture02 = new ContractLecture("Nam", "namnguyen1991@gmailcom", "12 Ung Văn Khiêm",
				"0908777828", 40, 110000, 40);
		Lecturer contractLecture03 = new ContractLecture("Vân", "vanguyen1992@gmailcom", "1 Cộng Hoà", "0980977828", 40,
				120000, 40);
		Lecturer contractLecture04 = new ContractLecture("Thái", "thainguyen1993@gmailcom", "10 Hà Nội", "0980779828",
				40, 150000, 40);

		List<Lecturer> listContractLecture = new ArrayList<>();
		listContractLecture.add(contractLecture01);
		listContractLecture.add(contractLecture02);
		listContractLecture.add(contractLecture03);
		listContractLecture.add(contractLecture04);

		Lecturer visitLecture01 = new VisitingLecture("Tuấn", "tuan1990@gmailcom", "123 Cộng Hoà", "0988777828", 40,
				"Trung tâm ABC");
		Lecturer visitLecture02 = new VisitingLecture("Vinh", "vinhguyen1991@gmailcom", "12 Điện Biên Phủ",
				"0908777828", 40, "Trung tâm ABC");
		Lecturer visitLecture03 = new VisitingLecture("Kiều", "kieuguyen1992@gmailcom", "1 Võ Thị Sáu", "0980977828",
				40, "Trung tâm ABC");
		Lecturer visitLecture04 = new VisitingLecture("Phương", "phuongnguyen1993@gmailcom", "10 Phan Văn Trị",
				"0980779828", 40, "Trung tâm ABC");

		List<Lecturer> listVisitLecture = new ArrayList<>();
		listVisitLecture.add(visitLecture01);
		listVisitLecture.add(visitLecture02);
		listVisitLecture.add(visitLecture03);
		listVisitLecture.add(visitLecture04);

		List<Lecturer> listLecture = new ArrayList<Lecturer>(listContractLecture);
		listLecture.addAll(listVisitLecture);
		System.out.println("====================================");
//		Xuất danh sách toàn bộ giảng viên
		for (Lecturer lecturer : listLecture) {
			System.out.println(lecturer);
		}
		System.out.println("====================================");
//		Xuất danh sách giảng viên cơ hữu
		for (Lecturer lecturer : listContractLecture) {
			System.out.println(lecturer);
		}
		System.out.println("====================================");
//		Xuất danh sách giảng viên thỉnh giảng
		for (Lecturer lecturer : listVisitLecture) {
			System.out.println(lecturer);
		}
		System.out.println("====================================");
//		Tính tổng số tiền lương của toàn bộ giảng viên
		int totalSalary = 0;
		for (Lecturer lecturer : listLecture) {
			totalSalary += lecturer.getSalary();
		}
		System.out.println("Total salary = " + totalSalary);
//		 Tổng lương cao nhất của giáo viên
		Lecturer maxSalary = listLecture.get(0);
		for (Lecturer item : listLecture) {
			if (item.getSalary() > maxSalary.getSalary())
				maxSalary = item;
		}
		System.out.println("====================================");
		System.out.println("Max Salary is: " + maxSalary);
		
		// Tìm loại giảng viên có tổng lương cao nhất.
		if (maxSalary instanceof VisitingLecture) {
			System.out.println("Max Salary is belong visiting lecture");
		}
		else {
			System.out.println("Max Salary is belong contract lecture");
		}

	}

}
