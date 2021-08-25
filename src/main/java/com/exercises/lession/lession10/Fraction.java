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
		sumNumerator = a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator();
		sumDenominator = a.getDenominator() * b.getDenominator();

		sumFraction = new Fraction(sumNumerator, sumDenominator);
		return reduceFraction(sumFraction.getNumerator(), sumFraction.getDenominator());
	}

	public Fraction subtractFraction(Fraction a, Fraction b) {
		Fraction subFraction;
		int subNumerator = 0;
		int subDenominator = 0;
		subNumerator = a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator();
		subDenominator = a.getDenominator() * b.getDenominator();

		subFraction = new Fraction(subNumerator, subDenominator);
		return reduceFraction(subFraction.getNumerator(), subFraction.getDenominator());
	}

	public Fraction multiplyFraction(Fraction a, Fraction b) {
		Fraction multiFraction;
		int multiNumerator = 0;
		int multiDenominator = 0;
		multiNumerator = a.getNumerator() * b.getNumerator();
		multiDenominator = a.getDenominator() * b.getDenominator();

		multiFraction = new Fraction(multiNumerator, multiDenominator);
		return reduceFraction(multiFraction.getNumerator(), multiFraction.getDenominator());
	}

	public Fraction divideFraction(Fraction a, Fraction b) {
		Fraction divFraction;
		int multiNumerator = 0;
		int multiDenominator = 0;
		multiNumerator = a.getNumerator() * b.getDenominator();
		multiDenominator = a.getDenominator() * b.getNumerator();

		divFraction = new Fraction(multiNumerator, multiDenominator);
		return reduceFraction(divFraction.getNumerator(), divFraction.getDenominator());
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
		a = a.reduceFraction(a.getNumerator(), a.getDenominator());
		b = b.reduceFraction(b.getNumerator(), b.getDenominator());

		int greatestCommonDivisor = greatestCommonDivisor(a.getDenominator(), b.getDenominator());
		int leastCommonMultiple = a.getDenominator() * b.getDenominator() / greatestCommonDivisor;

		a.numerator = a.numerator * (leastCommonMultiple / a.denominator);
		b.numerator = b.numerator * (leastCommonMultiple / b.denominator);
		a.denominator = b.denominator = leastCommonMultiple;
		return new Fraction[] { a, b };
	}

	public boolean isBiggerThanZero(Fraction a) {
		return (a.getNumerator() * a.getDenominator() > 0) ? true : false;
	}

	public void compareFraction(Fraction a, Fraction b) { // so sánh 2 phân số
		Fraction subFraction = subtractFraction(a, b);

		if (subFraction.isBiggerThanZero(subFraction)) {
			System.out.format("%d/%d > %d/%d\n", a.getNumerator(), a.getDenominator(), b.getNumerator(),
					b.getDenominator());
		} else if (subFraction.getNumerator() == 0 && subFraction.getNumerator() == 0) {
			System.out.format("%d/%d = %d/%d\n", a.getNumerator(), a.getDenominator(), b.getNumerator(),
					b.getDenominator());
		} else {
			System.out.format("%d/%d < %d/%d\n", a.getNumerator(), a.getDenominator(), b.getNumerator(),
					b.getDenominator());
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

}