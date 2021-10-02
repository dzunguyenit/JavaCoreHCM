package com.lession.lession24;

import java.time.LocalDate;

public class Order {
	private LocalDate date;
	private String customer;
	private double total;

	public Order() {
	}

	public Order(LocalDate date, String customer, double total) {
		this.date = date;
		this.customer = customer;
		this.total = total;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getCustomer() {
		return customer;
	}

	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Order {");
		sb.append("date=").append(date);
		sb.append(", customer='").append(customer).append('\'');
		sb.append(", total=").append(total);
		sb.append('}');
		return sb.toString();
	}
}
