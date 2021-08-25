package com.exercises.lession.lession10;

public class Exercise_01 {

//	//	 Phân số
//	 Khai báo kiểu dữ liệu phân số (Fraction)
//	 Nhập/Xuất phân số
//	 Rút gọn phân số
//	 Tính tổng, hiệu, tích, thương hai phân số
//	 Kiểm tra phân số tối giản
//	 Quy đồng hai phân số
//	 Kiểm tra phân số âm hay dương
//	 So sánh hai phân số
	public static void main(String[] args) {
		System.out.println("===============TEST PHAN SO:=================");
		Fraction ps1 = new Fraction(2, 4);
		Fraction ps2 = new Fraction(-1, 3);

		ps1.printFraction();
		ps2.printFraction();

		System.out.println("Phan so 1 toi gian -> " + ps1.isReduceFraction());
		System.out.println("Phan so 2 toi gian -> " + ps2.isReduceFraction());

		Fraction ps3 = ps1.reduceFraction(2, 4);
		Fraction ps4 = ps2.reduceFraction(-1, 3);
		ps3.printFraction();
		ps4.printFraction();

		System.out.print("Tong: ");
		ps1.addFraction(ps2).printFraction();
		System.out.print("Hieu: ");
		ps1.subFraction(ps2).printFraction();
		System.out.print("Tich: ");
		ps1.mulFraction(ps2).printFraction();
		System.out.print("Thuong: ");
		ps1.divFraction(ps2).printFraction();

		System.out.println("Quy dong: ");
		Fraction[] listPs = ps1.isomerizateFraction(ps2);
		listPs[0].printFraction();
		listPs[1].printFraction();

		System.out.println("Phan so ps1 duong -> " + ps1.isPossitiveFraction());
		ps1.compareFraction(ps2);
	}
}
