package round1760;

import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int max1 = -1;
			int max2 = -1;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if (max1 == -1 || a[i] > a[max1]) {
					max2 = max1;
					max1 = i;
				} else if (max2 == -1 || a[i] > a[max2]) {
					max2 = i;
				}
			}
			for (int i = 0; i < n; i++) {
				if (i == max1) {
					System.out.print(a[i] - a[max2]);
				} else if (i == max2) {
					System.out.print(a[i] - a[max1]);
				} else {
					System.out.print(a[i] - a[max1]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
