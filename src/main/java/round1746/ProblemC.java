package round1746;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProblemC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer t = Integer.parseInt(in.readLine());
		for (int tt = 0; tt < t; tt++) {
			int n = Integer.parseInt(in.readLine());
			String[] s = in.readLine().split(" ");
			int[] a = new int[s.length];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			test(a);
			System.out.println();
		}
	}

	private static void test(int[] a) {
		int n = a.length;
		List<Inversion> data = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				data.add(new Inversion(i + 1, a[i] - a[i + 1]));
			}
		}
		data.sort((i1, i2) -> {
			if (i1.diff == i2.diff) {
				return -Integer.compare(i1.pos, i2.pos);
			}
			return Integer.compare(i1.diff, i2.diff);
		});
		int current = 0;
		for (int step = 1; step <= n; step++) {
			if (current == data.size()) {
				System.out.print("1 ");
				continue;
			}
			Inversion cur = data.get(current);
			cur.diff -= step;
			System.out.print((cur.pos + 1) + " ");
			if (cur.diff <= 0) {
				current++;
			}
		}
	}
	
	static class Inversion {
		int pos;
		int diff;
		public Inversion(int pos, int diff) { 
			this.diff = diff;
			this.pos = pos;
		}
	}

}
