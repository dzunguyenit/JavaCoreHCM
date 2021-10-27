package com.lession.lession27;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.lession.lession27.complex.NumberFactoryTest;
import com.lession.lession27.simple.CalculatorTest;

@Suite
@SelectClasses({ CalculatorTest.class, NumberFactoryTest.class })
public class CustomSuite {
}
