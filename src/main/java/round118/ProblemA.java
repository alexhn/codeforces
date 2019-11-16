package round118;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.toLowerCase();
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (!isVowel(word.charAt(i))) {
				newWord.append(".");
				newWord.append(word.charAt(i));
			}
		}
		System.out.println(newWord.toString());
		sc.close();
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'y' || ch == 'u';
	}

}
