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

	public void printFraction() {
		if (isFraction()) {
			if (this.numerator == this.denominator) {
				System.out.println(1);
			} else if (this.numerator == 0) {
				System.out.println(0);
			} else {
				System.out.format("%d/%d\n", this.numerator, this.denominator);
			}

		} else {
			System.out.format("Input denominator != 0");
		}

	}

	public Fraction reduceFraction(int numerator, int denominator) {
		Fraction fraction = new Fraction(numerator, denominator);
		if (isFraction()) {
			int greatestCommonDivisor = greatestCommonDivisor(this.numerator, this.denominator);
			this.numerator = this.numerator / greatestCommonDivisor;
			this.denominator = this.denominator / greatestCommonDivisor;
		}
		return fraction;
	}

	public Fraction addFraction(Fraction fraction) {
		fraction = new Fraction(denominator, denominator);
		if (isFraction()) {
			this.numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
			this.denominator = this.denominator * fraction.denominator;
		}
		return reduceFraction(denominator, denominator);
	}

	public Fraction subFraction(Fraction ps) { // trừ 2 phân số
		Fraction Fraction = new Fraction(denominator, denominator);
		if (isFraction()) {
			Fraction.numerator = this.numerator * ps.denominator - ps.numerator * this.denominator;
			Fraction.denominator = this.denominator * ps.denominator;
		}
		return Fraction.reduceFraction(denominator, denominator);
	}

	public Fraction mulFraction(Fraction ps) { // tích 2 phân số
		Fraction Fraction = new Fraction(denominator, denominator);
		if (isFraction()) {
			Fraction.numerator = this.numerator * ps.numerator;
			Fraction.denominator = this.denominator * ps.denominator;
		}
		return Fraction.reduceFraction(denominator, denominator);
	}

	public Fraction divFraction(Fraction ps) { // thương 2 phân số
		Fraction Fraction = new Fraction(denominator, denominator);
		if (isFraction()) {
			Fraction.numerator = this.numerator * ps.denominator;
			Fraction.denominator = this.denominator * ps.numerator;
		}
		return Fraction.reduceFraction(denominator, denominator);
	}

	public boolean isReduceFraction() { // kiểm tra xem có phải phân số tối giản không
		if (isFraction()) {
			if (Math.abs(greatestCommonDivisor(this.numerator, this.denominator)) == 1) {
				return true;
			}
		}
		return false;
	}

	// Quy đồng hai phân số
	public Fraction[] isomerizateFraction(Fraction ps) {// quy đồng 2 phân số
		Fraction Fraction1 = new Fraction(denominator, denominator);
		Fraction Fraction2 = new Fraction(denominator, denominator);
		Fraction1.numerator = this.numerator;
		Fraction1.denominator = this.denominator;
		Fraction1 = Fraction1.reduceFraction(denominator, denominator);
		Fraction2 = ps.reduceFraction(denominator, denominator);

		int GCDms = greatestCommonDivisor(Fraction1.denominator, Fraction2.denominator);
		int ms = Fraction1.denominator * Fraction2.denominator / GCDms;
		Fraction1.numerator = Fraction1.numerator * Fraction2.denominator / GCDms;
		Fraction2.numerator = Fraction2.numerator * Fraction1.denominator / GCDms;
		Fraction1.denominator = Fraction2.denominator = ms;
		System.out.println("tu so 1 " + Fraction1.numerator);
		return new Fraction[] { Fraction1, Fraction2 };
	}

	public boolean isPossitiveFraction() { // kiểm tra xem có phải phân số dương không
		if (isFraction()) {
			if (this.numerator * this.denominator > 0) {
				return true;
			}
		}
		return false;
	}

	public void compareFraction(Fraction fraction) { // so sánh 2 phân số
		if (isFraction()) {
			fraction = new Fraction(this.numerator, this.denominator);
			int ts = this.numerator;
			int ms = this.denominator;
			fraction = subFraction(fraction);

			if (fraction.isPossitiveFraction()) {
				System.out.format("%d/%d > %d/%d\n", ts, ms, fraction.numerator, fraction.denominator);
			} else if (fraction.numerator == 0) {
				System.out.format("%d/%d = %d/%d\n", ts, ms, fraction.numerator, fraction.denominator);
			} else {
				System.out.format("%d/%d < %d/%d\n", ts, ms, fraction.numerator, fraction.denominator);
			}
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

}