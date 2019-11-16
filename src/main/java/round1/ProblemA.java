package round1;

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		
		long sideCnt = (m / a);
		if (m % a != 0) {
			sideCnt++;
		}
		
		long topCnt = (n / a);
		if (n % a != 0) {
			topCnt++;
		}
		
		System.out.println(sideCnt * topCnt);
		sc.close();
	}

}
