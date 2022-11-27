package round1760;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			String s = sc.next();
			int max = 0;
			for (int i = 0; i < s.length(); i++) {
				int value = s.charAt(i) - 'a' + 1;
				max = Math.max(max, value);
			}
			System.out.println(max);
		}
	}

}
