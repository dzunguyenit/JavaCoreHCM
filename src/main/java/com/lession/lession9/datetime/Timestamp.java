package com.lession.lession9.datetime;

import java.time.Duration;
import java.time.LocalDateTime;

public class Timestamp {

	public static void main(String[] args) {
		LocalDateTime rootDate = LocalDateTime.of(1970, 1, 1, 0, 0, 0);

		// Test1
		LocalDateTime date = LocalDateTime.of(2021, 8, 21, 1, 2, 3);
		long timestamp = Duration.between(rootDate, date).getSeconds();
		System.out.println(timestamp);

		date = rootDate.plusSeconds(timestamp);
		System.out.println(date);
		System.out.println("----------==========------------");

		// Test2
		date = LocalDateTime.of(2001, 12, 31, 23, 59, 59);
		timestamp = Duration.between(rootDate, date).getSeconds();
		System.out.println(timestamp);

		date = rootDate.plusSeconds(timestamp);
		System.out.println(date);
		System.out.println("----------==========------------");

		// Test3
		date = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
		timestamp = Duration.between(rootDate, date).getSeconds();
		System.out.println(timestamp);

		date = rootDate.plusSeconds(timestamp);
		System.out.println(date);
		System.out.println("----------==========------------");
	}
}