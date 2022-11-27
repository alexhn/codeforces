package round1746;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tt = Integer.parseInt(in.readLine());
		for (int t = 0; t < tt; t++) {
			int n = Integer.parseInt(in.readLine());
			int[] a = new int[n];
			String[] s = in.readLine().split(" ");
			int cnt1 = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
				if (a[i] == 1) {
					cnt1++;
				}
			}
			int j = n - 1;
			int actions = 0;
			while (j >= 0) {
				if (cnt1 == 0) {
					break;
				}
				if (a[j] == 1) {
					cnt1--;
				} else {
					actions++;
					cnt1--;
				}
				j--;
			}
			System.out.println(actions);
		}
	}

}
