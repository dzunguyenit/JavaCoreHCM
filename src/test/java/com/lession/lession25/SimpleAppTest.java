package com.lession.lession25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lession.lession25.SimpleApp;

public class SimpleAppTest {

	@Test
	void shouldShowHelloJUnit5() {
		String actual = SimpleApp.sayHello();
		String expected = "hello junit 5";
		Assertions.assertEquals(expected, actual);
	}
}
