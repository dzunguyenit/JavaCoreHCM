package com.lession.lession26.unittest;

import java.util.ArrayList;
import java.util.List;

public class NumberFactory {
	public static ArrayList<Integer> generate() {
		return new ArrayList<>(List.of(2, 4, 6, 8));
	}
}
