package round1714;

import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int qq = 0; qq < q; qq++) {
			String text = sc.next();
			int n = sc.nextInt();
			String[] s = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
			}
			Integer[] dp = new Integer[text.length()];
			int[] w = new int[text.length()];
			int[] prev = new int[text.length()];
			for (int i = 0; i < text.length(); i++) {
				dp[i] = null;
				for (int wordIndex = 0; wordIndex < s.length; wordIndex++) {
					String x = s[wordIndex];
					int from = i - x.length() + 1;
					if (from > 0 && text.substring(from, from + x.length()).equals(x)) {
						for (int k = from - 1; k < i; k++) {
							if (dp[k] != null) {
								if (dp[i] == null || dp[i] > dp[k] + 1) {
									dp[i] = dp[k] + 1;
									w[i] = wordIndex;
									prev[i] = k;
								}
							}
						}
					}
				}
			}
			if (dp[text.length() - 1] == null) {
				System.out.println(-1);
			} else {
				System.out.println(dp[text.length() - 1]);
				int pos = text.length() - 1;
				while (true) {
					System.out.println(w[pos] + " " + prev[pos]);
					pos = prev[pos];
					if (pos == 0) {
						break;
					}
				}
			}
		}
	}

}
