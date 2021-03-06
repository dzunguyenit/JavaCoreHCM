package com.lession.lession25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lession.lession25.unittest.Calculator;

@DisplayName("Calculator Class Unit-Test Cases")
class CalculatorTest {

	@Test
	@DisplayName("Should equal 5")
	void shouldEqual5() {
		double actual = Calculator.add(2, 3);
		double expected = 5f;
		assertEquals(expected, actual);
	}
}