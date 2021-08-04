package com.exercises.lession.lession2;

public class Exercise_06 {

	public static void main(String[] args) {

//		Nhập tên sản phẩm, số lượng và đơn giá.
//		Tính tiền và thuế giá trị gia tăng phải trả, biết:
//		a. tiền = số lượng * đơn giá
//		b. thuế giá trị gia tăng = 10% tiền

		int quantity = 15;
		int price = 200000;

		float tax;

		String productName = "A bag";

		int money = quantity * price;
		tax = (((float) 10) / 100) * money;

		System.out.println("Product name = " + productName);
		System.out.println("Money = " + quantity + " * " + price + " = " + money);
		System.out.println("Tax = " + tax);

	}

}
