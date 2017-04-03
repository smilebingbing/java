package mini;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		sc.close();
		long[] cache = new long[sum+1];
		cache[1] = 3;
		cache[2] = 9;
		for(int i = 3;i <= sum;i ++) {
			cache[i] = 3 * cache[i-2] + 2 * (cache[i-1] - cache[i-2]);
		}
		System.out.println(cache[sum]);;
	}
}
