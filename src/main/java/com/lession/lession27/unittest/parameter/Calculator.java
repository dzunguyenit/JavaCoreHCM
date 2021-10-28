package com.lession.lession27.unittest.parameter;

import java.util.stream.DoubleStream;

public class Calculator {
	public static double add(double... operands) {
		return DoubleStream.of(operands).sum();
	}
}
