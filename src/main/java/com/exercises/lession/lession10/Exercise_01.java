package com.exercises.lession.lession10;

public class Exercise_01 {

	// Phân số
	// Khai báo kiểu dữ liệu phân số (Fraction)
	// Nhập/Xuất phân số
	// Rút gọn phân số
	// Tính tổng, hiệu, tích, thương hai phân số
	// Kiểm tra phân số tối giản
	// Quy đồng hai phân số
	// Kiểm tra phân số âm hay dương
	// So sánh hai phân số
	public static void main(String[] args) {
		// Phân số
		Fraction fraction01 = new Fraction(1, 4);
		Fraction fraction02 = new Fraction(1, 2);

		// Nhập/Xuất phân số
		fraction01.printFraction(fraction01);
		fraction02.printFraction(fraction02);

		Fraction fraction01Reduce = fraction01.reduceFraction(fraction01.getNumerator(), fraction01.getDenominator());
		Fraction fraction02Reduce = fraction01.reduceFraction(fraction02.getNumerator(), fraction02.getDenominator());

		// Rút gọn phân số
		System.out.print("Fraction01 reduce = ");
		fraction01Reduce.printFraction(fraction01Reduce);

		System.out.print("Fraction02 reduce = ");
		fraction02Reduce.printFraction(fraction02Reduce);

		// Tính tổng hai phân số
		Fraction sumFraction = fraction01Reduce.sumFraction(fraction01Reduce, fraction02Reduce);
		System.out.print("Sum fraction01 + fraction02 = ");
		sumFraction.printFraction(sumFraction);

		// Tính hiệu hai phân số// Tính tổng, hiệu, tích, thương hai phân số
		Fraction subFraction = fraction01Reduce.subtractFraction(fraction01Reduce, fraction02Reduce);
		System.out.print("Subtract fraction01 - fraction02 = ");
		sumFraction.printFraction(subFraction);

		// Tính tích hai phân số
		Fraction multiFraction = fraction01Reduce.multiplyFraction(fraction01Reduce, fraction02Reduce);
		System.out.print("Multiply fraction01 * fraction02 = ");
		sumFraction.printFraction(multiFraction);

		// Tính thương hai phân số
		Fraction divFraction = fraction01Reduce.divideFraction(fraction01Reduce, fraction02Reduce);
		System.out.print("Divide fraction01 / fraction02 = ");
		sumFraction.printFraction(divFraction);

		// Kiểm tra phân số tối giản
		System.out.printf("Fraction 01 = %d/%d is reduce: " + fraction01.isReduceFraction(), fraction01.getNumerator(),
				fraction01.getDenominator());

		System.out.printf("\nFraction 02 = %d/%d is reduce: " + fraction02Reduce.isReduceFraction(),
				fraction02Reduce.getNumerator(), fraction02Reduce.getDenominator());

		// Quy đồng hai phân số
		Fraction[] arrayFraction = fraction01Reduce.reduceSameDenominatorFraction(fraction01Reduce, fraction02Reduce);
		System.out.print("\nFraction 01 = ");
		arrayFraction[0].printFraction(arrayFraction[0]);
		System.out.print("Fraction 02 = ");
		arrayFraction[1].printFraction(arrayFraction[1]);

		// Kiểm tra phân số âm hay dương
		System.out.println("Fraction is > 0: " + fraction01Reduce.isBiggerThanZero(fraction02Reduce));

		// So sánh hai phân số
		fraction01Reduce.compareFraction(fraction01Reduce, fraction02Reduce);
	}
}
