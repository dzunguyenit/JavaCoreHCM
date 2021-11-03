package com.exercises.lession.bonus.java8.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		Student student01 = new Student(1, "Vu Nguyen 01", "vunguyen01@gmail.co", 1.0, 2.0, 3.0, 6.0);
		Student student02 = new Student(1, "Vu Nguyen 02", "vunguyen02@gmail.co", 2.0, 4.0, 5.0, 6.0);
		Student student03 = new Student(1, "Vu Nguyen 03", "vunguyen03@gmail.co", 3.0, 4.0, 5.0, 6.0);
		Student student04 = new Student(1, "Vu Nguyen 04", "vunguyen04@gmail.co", 4.0, 4.0, 5.0, 6.0);
		Student student05 = new Student(1, "Vu Nguyen 05", "vunguyen05@gmail.co", 5.0, 4.0, 5.0, 6.0);
		Student student06 = new Student(1, "Vu Nguyen 06", "vunguyen06@gmail.co", 6.0, 4.0, 5.0, 6.0);
		Student student07 = new Student(1, "Vu Nguyen 07", "vunguyen07@gmail.co", 7.0, 4.0, 5.0, 6.0);
		Student student08 = new Student(1, "Vu Nguyen 08", "vunguyen08@gmail.co", 8.0, 4.0, 5.0, 6.0);
		Student student09 = new Student(1, "Vu Nguyen 09", "vunguyen09@gmail.co", 9.0, 4.0, 5.0, 6.0);
		Student student10 = new Student(1, "Vu Nguyen 10", "vunguyen10@gmail.co", 10, 4.0, 5.0, 6.0);
		Student student11 = new Student(1, "Vu Nguyen 11", "vunguyen11@gmail.co", 9.0, 4.0, 5.0, 6.0);
		Student student12 = new Student(1, "Vu Nguyen 12", "vunguyen12@gmail.co", 8.0, 4.0, 5.0, 6.0);
		Student student13 = new Student(1, "Vu Nguyen 13", "vunguyen13@gmail.co", 7.0, 4.0, 5.0, 6.0);
		Student student14 = new Student(1, "Vu Nguyen 14", "vunguyen14@gmail.co", 6.0, 4.0, 5.0, 6.0);
		Student student15 = new Student(1, "Vu Nguyen 15", "vunguyen15@gmail.co", 4.0, 4.0, 5.0, 6.0);
		Student student16 = new Student(1, "Vu Nguyen 16", "vunguyen16@gmail.co", 5.0, 4.0, 5.0, 6.0);
		Student student17 = new Student(1, "Vu Nguyen 17", "vunguyen17@gmail.co", 4.0, 4.0, 5.0, 6.0);
		Student student18 = new Student(1, "Vu Nguyen 18", "vunguyen18@gmail.co", 2.0, 4.0, 5.0, 6.0);
		Student student19 = new Student(1, "Vu Nguyen 19", "vunguyen19@gmail.co", 1.0, 4.0, 5.0, 6.0);
		Student student20 = new Student(1, "Vu Nguyen 20", "vunguyen20@gmail.co", 0, 4.0, 5.0, 6.0);

		List<Student> students = new ArrayList<Student>();
		Collections.addAll(students, student01, student02, student03, student04, student05, student06, student07,
				student08, student09, student10, student11, student12, student13, student14, student15, student16,
				student17, student18, student19, student20);

		long count = students.stream().filter(student -> student.getBonus() > 8).count();
		System.out.println(count);

		Student min = students.stream().min(Comparator.comparing(Student::getBonus)).get();

		System.out.println(min);

		Student max = students.stream().max(Comparator.comparing(Student::getBonus)).get();

		System.out.println(max);

		List<Student> topTentudent = students.stream().sorted(Comparator.comparingDouble(Student::getBonus).reversed())
				.limit(10).collect(Collectors.toList());
		System.out.println("===========================================");
		for (Student student : topTentudent) {
			System.out.println(student);
		}

		List<Student> bottomTentudent = students.stream().sorted(Comparator.comparingDouble(Student::getBonus))
				.limit(10).collect(Collectors.toList());
		System.out.println("===========================================");
		for (Student student : bottomTentudent) {
			System.out.println(student);
		}
	}

}
