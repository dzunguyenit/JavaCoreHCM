package com.lession.lession26;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lession.lession26.unittest.Calculator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Class Unit-Test Cases")
class CalculatorTest {

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