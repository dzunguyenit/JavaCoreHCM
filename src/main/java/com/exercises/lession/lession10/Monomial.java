package com.exercises.lession.lession10;

public class Monomial {

//   Đơn thức: ax^n
//	 Khai báo kiểu dữ liệu đơn thức (Monomial)
//	 Nhập/Xuất đơn thức
//	 Tính tích, thương hai đơn thức
//	 Tính đạo hàm cấp 1 của đơn thức
//	 Tính đạo hàm cấp k của đơn thức
//	 Tính giá trị đơn thức tại x = x0
	// XÉT ĐƠN THỨC ĐƠN GIẢN DẠNG 1 BIẾN với hệ số nguyên
	private int ax;

	private int pow;

	public Monomial() {
	}

	public Monomial(int a, int pow) {
		this.ax = a;
		this.pow = pow;
	}

	public void printMonomial() {
		if (this.pow == 0) {
			System.out.format("%d\n", this.ax);
		} else if (this.pow == 1) {
			System.out.format("%dx\n", this.ax);
		} else if (this.ax == 0) {
			System.out.format("0\n");
		} else {
			System.out.format("%dx^%d\n", this.ax, this.pow);
		}

	}

	public Monomial multiMonomial(Monomial a, Monomial b) {
		Monomial multiMonomial;
		int multiA = 0;
		int multiPow = 0;
		multiA = a.ax * b.ax;
		multiPow = a.pow + b.pow;
		multiMonomial = new Monomial(multiA, multiPow);
		return multiMonomial;
	}

	public Monomial divideMonomial(Monomial a, Monomial b) {
		Monomial divMonomial;
		int divA = 0;
		int divPow = 0;
		divA = a.ax / b.ax;
		divPow = a.pow - b.pow;
		divMonomial = new Monomial(divA, divPow);
		return divMonomial;
	}

	// đạo hàm cấp 1 của đơn thức
	public Monomial derivativeMonomialLevelOne(int a, int pow) {
		Monomial monomial = new Monomial(a, pow);
		monomial.ax = monomial.ax * monomial.pow;
		monomial.pow = monomial.pow - 1;
		return monomial;
	}

	// đạo hàm cấp k của đơn thức
	public Monomial DerivativeMonomialLevelK(int a, int pow, int k) { // đạo hàm cấp k của đơn thức
		Monomial monomial = new Monomial(a, pow);
		monomial.ax = monomial.ax;
		monomial.pow = monomial.pow;
		if (k > monomial.pow) {
			monomial.ax = monomial.pow = 0;
		} else {
			while (k > 0) {
				monomial.ax *= monomial.pow;
				monomial.pow -= 1;
				k--;
			}
		}
		return monomial;
	}

	public int getValueMonomial(int x0) { // Tính giá trị đơn thức tại x = x0
		return (int) (ax * Math.pow(x0, this.pow));
	}

	public int getAx() {
		return ax;
	}

	public void setAx(int ax) {
		this.ax = ax;
	}

	public int getPow() {
		return pow;
	}

	public void setPow(int pow) {
		this.pow = pow;
	}

	public static void main(String[] args) {
		Monomial monomial1 = new Monomial(2, 7);
		Monomial monomial2 = new Monomial(1, 2);
		monomial1.printMonomial();
		monomial2.printMonomial();

		Monomial monomial = monomial1.multiMonomial(monomial1, monomial2);

		// Tính tích 2 đơn thức
		System.out.printf("Multiply: %dx^%d * %dx^%d = ", monomial1.getAx(), monomial1.getPow(), monomial2.getAx(),
				monomial2.getPow());
		monomial.printMonomial();

		// Tính thương 2 đơn thức
		System.out.printf("Divide: %dx^%d / %dx^%d = ", monomial1.getAx(), monomial1.getPow(), monomial2.getAx(),
				+monomial2.getPow());
		monomial = monomial1.divideMonomial(monomial1, monomial2);
		monomial.printMonomial();

		// Đạo hàm cấp 1
		System.out.printf("Derivative Monomial Level 1 %dx^%d: ", monomial1.getAx(), monomial1.getPow());
		monomial = monomial1.derivativeMonomialLevelOne(monomial1.getAx(), monomial1.getPow());
		monomial.printMonomial();

		// Đạo hàm cấp k
		int k = 5;
		System.out.printf("Derivative Monomial Level %d %dx^%d: ", k, monomial1.getAx(), monomial1.getPow());
		monomial = monomial1.DerivativeMonomialLevelK(monomial1.getAx(), monomial1.getPow(), k);
		monomial.printMonomial();

		// Tính giá trị đơn thức tại x = x0
		int x0 = -1;
		System.out.printf("Value %dx^%d at x = " + x0 + " is: " + monomial1.getValueMonomial(x0), monomial1.getAx(),
				monomial1.getPow());
	}

}