package com.exercises.lession.lession19;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> results = new ArrayList<String>();

		File[] files = new File(System.getProperty("user.dir")).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}

		for (String fileName : results) {
			System.out.println(fileName);
		}
	}
}