package round1760;

import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int l = 0;
			int cntGood = 0;
			while (l < a.length) {
				int r = l + 1;
				while (r < a.length && a[r] == a[l]) {
					r++;
				}
				if (l == 0 || a[l - 1] > a[l]) {
					if (r == a.length || a[r] > a[r - 1]) {
						cntGood++;
					}
				}
				l = r;
			}
			if (cntGood == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
