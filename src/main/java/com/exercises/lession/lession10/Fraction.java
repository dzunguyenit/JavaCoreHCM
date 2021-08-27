package com.exercises.lession.lession10;

public class Fraction {
//	 Phân số
//	 Khai báo kiểu dữ liệu phân số (Fraction)
//	 Nhập/Xuất phân số
//	 Rút gọn phân số
//	 Tính tổng, hiệu, tích, thương hai phân số
//	 Kiểm tra phân số tối giản
//	 Quy đồng hai phân số
//	 Kiểm tra phân số âm hay dương
//	 So sánh hai phân số

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public boolean isFraction() {
		return (denominator == 0) ? false : true;
	}

	public void printFraction(Fraction fraction) {
		if (isFraction()) {
			if (this.numerator == this.denominator) {
				System.out.println(1);
			} else if (this.numerator == 0) {
				System.out.println(0);
			} else {
				System.out.format("%d/%d\n", fraction.numerator, fraction.denominator);
			}

		} else {
			System.out.format("Input denominator != 0");
		}

	}

	public Fraction reduceFraction(int numerator, int denominator) {
		Fraction fraction = new Fraction(numerator, denominator);
		if (isFraction()) {
			int greatestCommonDivisor = greatestCommonDivisor(numerator, denominator);
			fraction.numerator = numerator / greatestCommonDivisor;
			fraction.denominator = denominator / greatestCommonDivisor;
		}
		return fraction;
	}

	public Fraction sumFraction(Fraction a, Fraction b) {
		Fraction sumFraction;
		int sumNumerator = 0;
		int sumDenominator = 0;
		sumNumerator = a.numerator * b.denominator + a.denominator * b.numerator;
		sumDenominator = a.denominator * b.denominator;

		sumFraction = new Fraction(sumNumerator, sumDenominator);
		return reduceFraction(sumFraction.numerator, sumFraction.denominator);
	}

	public Fraction subtractFraction(Fraction a, Fraction b) {
		Fraction subFraction;
		int subNumerator = 0;
		int subDenominator = 0;
		subNumerator = a.numerator * b.denominator - a.denominator * b.numerator;
		subDenominator = a.denominator * b.denominator;

		subFraction = new Fraction(subNumerator, subDenominator);
		return reduceFraction(subFraction.numerator, subFraction.denominator);
	}

	public Fraction multiplyFraction(Fraction a, Fraction b) {
		Fraction multiFraction;
		int multiNumerator = 0;
		int multiDenominator = 0;
		multiNumerator = a.numerator * b.numerator;
		multiDenominator = a.denominator * b.denominator;

		multiFraction = new Fraction(multiNumerator, multiDenominator);
		return reduceFraction(multiFraction.numerator, multiFraction.denominator);
	}

	public Fraction divideFraction(Fraction a, Fraction b) {
		Fraction divFraction;
		int multiNumerator = 0;
		int multiDenominator = 0;
		multiNumerator = a.numerator * b.denominator;
		multiDenominator = a.denominator * b.numerator;

		divFraction = new Fraction(multiNumerator, multiDenominator);
		return reduceFraction(divFraction.numerator, divFraction.denominator);
	}

	public boolean isReduceFraction() {
		if (isFraction()) {
			if (Math.abs(greatestCommonDivisor(this.numerator, this.denominator)) == 1) {
				return true;
			}
		}
		return false;
	}

	// Quy đồng hai phân số
	public Fraction[] reduceSameDenominatorFraction(Fraction a, Fraction b) {
		a = a.reduceFraction(a.numerator, a.denominator);
		b = b.reduceFraction(b.numerator, b.denominator);

		int greatestCommonDivisor = greatestCommonDivisor(a.denominator, b.denominator);
		int leastCommonMultiple = a.denominator * b.denominator / greatestCommonDivisor;

		a.numerator = a.numerator * (leastCommonMultiple / a.denominator);
		b.numerator = b.numerator * (leastCommonMultiple / b.denominator);
		a.denominator = b.denominator = leastCommonMultiple;
		return new Fraction[] { a, b };
	}

	public boolean isBiggerThanZero(Fraction a) {
		return (a.numerator * a.denominator > 0) ? true : false;
	}

	public void compareFraction(Fraction a, Fraction b) { // so sánh 2 phân số
		Fraction subFraction = subtractFraction(a, b);

		if (subFraction.isBiggerThanZero(subFraction)) {
			System.out.format("%d/%d > %d/%d\n", a.numerator, a.denominator, b.numerator, b.denominator);
		} else if (subFraction.numerator == 0 && subFraction.numerator == 0) {
			System.out.format("%d/%d = %d/%d\n", a.numerator, a.denominator, b.numerator, b.denominator);
		} else {
			System.out.format("%d/%d < %d/%d\n", a.numerator, a.denominator, b.numerator, b.denominator);
		}
	}

	public int greatestCommonDivisor(int a, int b) {
		int tmp;
		while (b != 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

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
		Fraction fraction01 = new Fraction(6, 8);
		Fraction fraction02 = new Fraction(1, 2);

		// Nhập/Xuất phân số
		fraction01.printFraction(fraction01);
		fraction02.printFraction(fraction02);

		Fraction fraction01Reduce = fraction01.reduceFraction(fraction01.getNumerator(), fraction01.getDenominator());
		Fraction fraction02Reduce = fraction01.reduceFraction(fraction02.getNumerator(), fraction02.getDenominator());

		// Rút gọn phân số
		System.out.printf("Fraction01: %d/%d reduce = ", fraction01.getNumerator(), fraction01.getDenominator());
		fraction01Reduce.printFraction(fraction01Reduce);

		System.out.printf("Fraction02: %d/%d reduce = ", fraction02.getNumerator(), fraction02.getDenominator());
		fraction02Reduce.printFraction(fraction02Reduce);

		// Tính tổng hai phân số
		Fraction sumFraction = fraction01Reduce.sumFraction(fraction01Reduce, fraction02Reduce);
		System.out.printf("Sum: %d/%d + %d/%d = ", fraction01Reduce.getNumerator(), fraction01Reduce.getDenominator(),
				fraction02Reduce.getNumerator(), fraction02Reduce.getDenominator());
		sumFraction.printFraction(sumFraction);

		// Tính hiệu hai phân số// Tính tổng, hiệu, tích, thương hai phân số
		Fraction subFraction = fraction01Reduce.subtractFraction(fraction01Reduce, fraction02Reduce);
		System.out.printf("Subtract: %d/%d - %d/%d = ", fraction01Reduce.getNumerator(),
				fraction01Reduce.getDenominator(), fraction02Reduce.getNumerator(), fraction02Reduce.getDenominator());
		sumFraction.printFraction(subFraction);

		// Tính tích hai phân số
		Fraction multiFraction = fraction01Reduce.multiplyFraction(fraction01Reduce, fraction02Reduce);
		System.out.printf("Multiply: %d/%d * %d/%d = ", fraction01Reduce.getNumerator(),
				fraction01Reduce.getDenominator(), fraction02Reduce.getNumerator(), fraction02Reduce.getDenominator());
		sumFraction.printFraction(multiFraction);

		// Tính thương hai phân số
		Fraction divFraction = fraction01Reduce.divideFraction(fraction01Reduce, fraction02Reduce);
		System.out.printf("Divide: %d/%d / %d/%d = ", fraction01Reduce.getNumerator(),
				fraction01Reduce.getDenominator(), fraction02Reduce.getNumerator(), fraction02Reduce.getDenominator());
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
		System.out.printf("Fraction %d/%d is > 0: " + fraction01Reduce.isBiggerThanZero(fraction02Reduce) + "\n",
				fraction01Reduce.getNumerator(), fraction01Reduce.getDenominator());

		// So sánh hai phân số
		fraction01Reduce.compareFraction(fraction01Reduce, fraction02Reduce);
	}

}