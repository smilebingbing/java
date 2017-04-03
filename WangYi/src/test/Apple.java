package test;

import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = min(n);
		if(res < 1000){
			System.out.println(res);
		}else{
			System.out.println(-1);
		}
	}
	
	public static int min(int n){
		if(n == 6 || n == 8){
			return 1;
		}else if(n < 8 && n != 6){
			return 10000;
		}else{
			int app_6 = min(n - 6) + 1;
			int app_8 = min(n - 8) + 1;
			return app_6 >= app_8 ? app_8 :app_6;
		}
		
	}
}
