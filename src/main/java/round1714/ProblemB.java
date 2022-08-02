package round1714;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProblemB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int t = 0; t < tests; t++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			Set<Integer> values = new HashSet<>();
			int current = n - 1;
			while (current >= 0) {
				if (values.contains(a[current])) {
					break;
				}
				values.add(a[current]);
				current--;
			}
			System.out.println(current + 1);
		}
	}
	
}
