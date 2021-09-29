package com.exercises.lession.lession19;

import java.io.File;

public class ExerciseFileIO {

	public static String printPathTree(File folder) {
		if (!folder.isDirectory()) {
			throw new IllegalArgumentException(folder + " folder is not a Directory");
		}
		int sizeSpace = 0;
		StringBuilder sb = new StringBuilder();
		printPathTree(folder, sizeSpace, sb);
		return sb.toString();
	}

	private static void printPathTree(File folder, int sizeSpace, StringBuilder sb) {
		for (int i = 0; i < sizeSpace; i++) {
			sb.append("|  ");
		}
		sb.append("+").append(folder.getName()).append("/").append("\n");
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				printPathTree(file, sizeSpace + 1, sb);
			} else {
				printFile(file, sizeSpace + 1, sb);
			}
		}

	}

	private static void printFile(File file, int sizeSpace, StringBuilder sb) {
		for (int i = 0; i < sizeSpace; i++) {
			sb.append("|  ");
		}

		sb.append("+--").append(file.getName()).append("\n");
	}

	public static void main(String[] args) {
		File tempDerectory = new File(System.getProperty("user.dir") + "/");
		System.out.println(ExerciseFileIO.printPathTree(tempDerectory));

	}
}