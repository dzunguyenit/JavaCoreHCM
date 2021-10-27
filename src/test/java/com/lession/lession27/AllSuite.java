package com.lession.lession27;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({ "com.onemount.tests.simple", "com.onemount.tests.complex" })
public class AllSuite {
}