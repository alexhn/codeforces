package cf1746;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tt = sc.nextInt();
		for (int t = 0; t < tt; t++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			boolean has1 = false;
			for (int i = 0; i < n; i++) {
				has1 |= a[i] == 1;
			}
			if (has1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
