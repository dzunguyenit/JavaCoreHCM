package com.exercises.lession.lession7.string;

import java.util.Scanner;

public class Exercise_07 {

	public static int[] countVowelConsonant(String s) {

		int countVowelCharacter = 0;
		int countConsonantCharacter = 0;

		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
//			ueoai
			char character = s.charAt(i);
			if (character == 'u' || character == 'e' || character == 'o' || character == 'a' || character == 'i') {
				countVowelCharacter++;
			} else if (character >= 'a' && character <= 'z')
				countConsonantCharacter++;
		}

		return new int[] { countVowelCharacter, countConsonantCharacter };

	}

	public static void main(String[] args) {
		System.out.println("--------Exercise_07--------");
		Scanner scanner = new Scanner(System.in);
		String s;

		System.out.println("Input string: ");
		s = scanner.nextLine();

		int count[] = countVowelConsonant(s);

		int countVowelCharacter = count[0];
		int countConsonantCharacter = count[1];

		System.out.println("Quantity of Vowel = " + countVowelCharacter);
		System.out.println("Quantity of Consonant = " + countConsonantCharacter);

	}
}