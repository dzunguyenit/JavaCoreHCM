package com.lession.lession9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeAndString {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		LocalDateTime ldt = LocalDateTime.of(2021, 8, 20, 10, 0, 0);
		System.out.println(ldt);
		System.out.println("------------------");

		System.out.println(now.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(now.format(DateTimeFormatter.ISO_DATE));
		System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
		// System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		// System.out.println(now.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		System.out.println("------------------");

		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(now.format(f));

		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE");
		System.out.println(now.format(f2));
		System.out.println("------------------");

		String strD = "20/8/2021";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ld = LocalDate.parse(strD, df);
		System.out.println(ld);
		System.out.println("------------------");

		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(2021, 11, 15);
		Period p = Period.between(d1, d2);
		System.out.println(p);

		LocalDateTime ldt2 = LocalDateTime.of(2021, 10, 10, 10, 10, 10);
		Duration dr = Duration.between(ldt, ldt2);
		System.out.println(dr);
		System.out.println(dr.toDays());
		System.out.println(dr.toHours());

		System.out.println("------------------");

		// Set<String> zones = ZoneId.getAvailableZoneIds();
		// for (String z : zones) {
		// System.out.println(z);
		// }
		//
		// ZonedDateTime zdt = ZonedDateTime.of(now, ZoneId.of("Etc/GMT+8"));
		// System.out.println(zdt);
	}

	// public static void main(String[] args) {
	// LocalTime lt = LocalTime.of(9, 30, 40);
	// System.out.println(lt);
	//
	// LocalTime lt2 = LocalTime.ofSecondOfDay(60);
	// System.out.println(lt2);
	//
	// LocalTime now = LocalTime.now();
	// System.out.println(now);
	//
	// System.out.println(now.getHour());
	// System.out.println(now.getMinute());
	// System.out.println(now.getSecond());
	// System.out.println(now.getNano());
	//
	// System.out.println(now.plusHours(2));
	// System.out.println(now.plusMinutes(2));
	// System.out.println(now.plusSeconds(2));
	// }

	// public static void main(String[] args) {
	// LocalDate today = LocalDate.now();
	// System.out.println(today);
	//
	// LocalDate ld = LocalDate.of(2021, 9, 15);
	// System.out.println(ld);
	// System.out.println("------------------");
	//
	// System.out.println(today.getDayOfYear());
	// System.out.println(today.getDayOfMonth());
	// System.out.println(today.getDayOfWeek());
	// System.out.println("------------------");
	//
	// System.out.println(today.getMonth());
	// System.out.println(today.getMonthValue());
	// System.out.println("------------------");
	//
	// System.out.println(today.getYear());
	// System.out.println("------------------");
	//
	// System.out.println(today.plusDays(2));
	// System.out.println(today.plusMonths(1));
	// System.out.println(today.plusYears(2));
	// System.out.println(today.plusWeeks(2));
	// System.out.println("------------------");
	//
	// System.out.println(today.minusDays(2));
	// System.out.println(today.minusMonths(1));
	// System.out.println(today.minusYears(2));
	// System.out.println(today.minusWeeks(2));
	// System.out.println("------------------");
	//
	// System.out.println(today.compareTo(ld));
	// System.out.println(today.compareTo(LocalDate.now()));
	// System.out.println(today.compareTo(LocalDate.of(2021, 8, 19)));
	// System.out.println("------------------");
	//
	// System.out.println(today.isBefore(ld));
	// System.out.println(today.isAfter(ld));
	// if (today.isEqual(LocalDate.of(2021, 8, 20))) {
	// System.out.println("Equals!");
	// }
	// System.out.println("------------------");
	//
	// LocalDate eld = LocalDate.ofEpochDay(10);
	// System.out.println(eld);
	// }

	// public static void main(String[] args) {
	//
	// String firstString = "Hello OneMount Group.";
	//
	// // firstString = firstString + "123";
	//
	// int max = 100;
	// firstString = String.format("MAX = %d\n", max);
	// System.out.println(firstString);
	//
	// String s = " Java ";
	// System.out.println("Chuỗi ban đầu: " + s);
	// System.out.println("Sau khi loại bỏ khoảng trắng: " + s.trim()); // method
	// trim() loại bỏ khoảng trắng ở đầu và cuối chuỗi
	//
	// String s1 = "Java";
	// String s2 = "Java";
	// String s3 = "JAVA";
	// System.out.println(s1 == s2);
	// System.out.println(s1.equals(s2));
	//
	// System.out.println(s1 == s3);
	// System.out.println(s1.equals(s3));
	// System.out.println(s1.equalsIgnoreCase(s3));
	//
	// String s4 = "java";
	// String s5 = "JAVA".toLowerCase();
	// System.out.println(s5);
	// System.out.println(s4 == s5);
	// System.out.println(s4.equals(s5));
	//
	// String s6 = s4.replace('a', 'b');
	// System.out.println(s6);
	//
	// char c = s4.charAt(0);
	// System.out.println(c);
	//
	// int idx = s4.indexOf('p');
	// System.out.println(idx);
	// int idxSubStr = s4.indexOf("va");
	// System.out.println(idxSubStr);
	//
	// String s9 = "Java for OneMount Group!";
	// System.out.println(s9.substring(9));
	//
	// int bIdx = s9.indexOf("Group");
	// int eIdx = "Group".length() + bIdx;
	// if (bIdx >= 0) {
	// System.out.println(s9.substring(bIdx, eIdx));
	// }
	//
	// String ps = "1/3";
	// String[] parts = ps.split("/");
	// System.out.println(parts.length);
	// for (String p : parts) {
	// System.out.println(p);
	// }
	// }

}