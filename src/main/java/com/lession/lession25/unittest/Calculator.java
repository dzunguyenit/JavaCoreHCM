package com.lession.lession25.unittest;

import java.util.stream.DoubleStream;

public class Calculator {
	public static double add(double... operands) {
		return DoubleStream.of(operands).sum();
	}
}
