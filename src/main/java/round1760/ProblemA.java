package round1760;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int[] arr = new int[] { a, b, c };
			System.out.println(Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow());
		}
	}

}
