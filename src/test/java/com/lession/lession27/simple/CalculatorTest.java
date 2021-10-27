package com.lession.lession27.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lession.lession27.Calculator;

@DisplayName("com.onemount.Calculator Class Unit-Test Cases")
public class CalculatorTest {

	@Test
	@DisplayName("Should equal 5")
	void shouldEqual5() {
		double actual = Calculator.add(2, 3);
		double expected = 5f;
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Should not run this assertion")
	@Disabled("Not implemented")
	void shouldNotRunThisAssertion() {

	}
}