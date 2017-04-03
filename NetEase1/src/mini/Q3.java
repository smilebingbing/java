package mini;

import java.util.Arrays;
import java.util.Scanner;


public class Q3 {

	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		int[] cache = new int[M+1];
		Arrays.fill(cache, 100000);
		cache[M] = 0;
		boolean flag;
		for(int i = M-1;i >= N; i--) {
			flag = false;
			for(int j = M;j > i;j --) {
				count ++;
				int dist = j-i;
				if(dist != 1 && dist != i && i % dist == 0) {
					cache[i] = cache[j] + 1;
					flag = true;
					System.out.println(M-j);
					break;
				}
			}
			if(!flag){
				cache[i] = -1;
			}
		}
//		for(Integer i : cache) {
//			System.out.print(i + " ");
//		}System.out.println();
		System.out.println(count);
		System.out.println(cache[N]);
	}
}
/////////////////////超时/////////////////////要遍历的太多了
