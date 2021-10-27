package com.lession.lession27;

import java.util.*;

public class SimpleApp {
	public static String sayHello() {
		return "hello junit 5";
	}

	public static void main(String[] args) {
		// Set<String> setA = new HashSet<>();
		// setA.add("Java");
		// setA.add("c#");
		// setA.add("Java");
		// setA.add("Python");
		//
		// System.out.println(setA.size());
		// System.out.println(setA.contains("c#"));
		// System.out.println(setA);
		//
		// // Iterator<String> iterator = setA.iterator();
		// // while (iterator.hasNext()) {
		// // System.out.println(iterator.next());
		// // }
		//
		// for (String str : setA) {
		// System.out.println(str);
		// }

		Map<String, String> map = new HashMap<>();
		map.put("A", "Andre");
		map.put("X", "Xavier");

		String value = map.get("A");
		System.out.println(value);

		for (String key : map.keySet()) {
			System.out.printf("Key: %s, Value: %s\n", key, map.get(key));
		}
	}
}