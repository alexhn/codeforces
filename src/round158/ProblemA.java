package round158;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		int[] a = new int[n];
		for (int i =0 ; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] >= a[k - 1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
