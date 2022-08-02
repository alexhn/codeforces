package round1714;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int test = 0; test < tests; test++) {
			int alarms = sc.nextInt();
			int[] hh = new int[alarms];
			int[] mm = new int[alarms];
			int hh_bed = sc.nextInt();
			int mm_bed = sc.nextInt();
			for (int i = 0; i < alarms; i++) {
				hh[i] = sc.nextInt();
				mm[i] = sc.nextInt();
			}
			int current_hh = hh_bed;
			int current_mm = mm_bed;
			int totalSleep = 0;
			while (true) {
				boolean found = false;
				for (int i = 0; i < alarms; i++) {
					if (hh[i] == current_hh && mm[i] == current_mm) {
						found = true;
						break;
					}
				}
				if (found) {
					break;
				}
				totalSleep++;
				current_mm = (current_mm + 1) % 60;
				if (current_mm == 0) {
					current_hh++;
				}
				if (current_hh >= 24) {
					current_hh = 0;
				}
			}
			int totalSleepHours = totalSleep / 60;
			int totalSleepMinutes = totalSleep % 60;
			System.out.println(totalSleepHours + " " + totalSleepMinutes);
		}
	}

}
