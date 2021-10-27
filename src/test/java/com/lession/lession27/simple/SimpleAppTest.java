package com.lession.lession27.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lession.lession27.SimpleApp;

public class SimpleAppTest {

	@Test
	void shouldShowHelloJUnit5() {
		String actual = SimpleApp.sayHello();
		String expected = "hello junit 5";
		Assertions.assertEquals(expected, actual);
	}
}
