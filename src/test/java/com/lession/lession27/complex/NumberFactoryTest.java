package com.lession.lession27.complex;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lession.lession27.NumberFactory;

public class NumberFactoryTest {

	@BeforeAll
	static void prepare() {
		System.setProperty("env", "dev");
	}

	@Test
	@DisplayName("should contains 2,4,6,8")
	void shouldContains2468() {
		ArrayList<Integer> list = NumberFactory.generate();
		assertAll(() -> assertEquals(2, list.get(0)), () -> assertEquals(4, list.get(1)),
				() -> assertEquals(6, list.get(2)), () -> assertEquals(8, list.get(3)));
	}

	// @Test
	// @DisplayName("auto-passed")
	// void autoPassedTestCase() {
	// list.set(0, 3);
	// list.set(1, 5);
	// list.set(2, 7);
	// list.set(3, 9);
	// assertEquals(1, 1);
	// }

	@Test
	@DisplayName("Should contains 3,5,7,9, @prod")
	void shouldContains3579() {

		Assumptions.assumeTrue(System.getProperty("env").equals("prod"));

		ArrayList<Integer> list = NumberFactory.generate();
		assertAll(() -> assertEquals(3, list.get(0)), () -> assertEquals(5, list.get(1)),
				() -> assertEquals(7, list.get(2)), () -> assertEquals(9, list.get(3)));
	}
}