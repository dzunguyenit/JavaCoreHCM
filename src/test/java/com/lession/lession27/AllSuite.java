package com.lession.lession27;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({ "com.lession.lession27.simple", "com.lession.lession27.complex" })
public class AllSuite {
}