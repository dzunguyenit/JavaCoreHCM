package com.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.exercises.lession.bonus.java8.student.Person;

@DisplayName("Java8Basic")
class Java8Basic {

	@Test
	@DisplayName("Should equal 5")
	void shouldEqual5() {
		Person alex = new Person("Alex", 23);
		Person john = new Person("John", 40);
		Person peter = new Person("Peter", 32);
		List<Person> people = Arrays.asList(alex, john, peter);

		// then
		Person minByAge = people.stream().min(Comparator.comparing(Person::getAge))
				.orElseThrow(NoSuchElementException::new);
		assertEquals(alex, minByAge);
	}
}
