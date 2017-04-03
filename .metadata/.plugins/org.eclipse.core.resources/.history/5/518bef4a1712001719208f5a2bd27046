package mini;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int que = sc.nextInt();
		sc.close();
		int resu = 0;
		int flag = que;
		for(int i = 1;i <= que;i += 2) {
			resu += i;
			resu += odd(i+1);
		}
		if(flag % 2 == 0) {
			System.out.println(resu);			
		} else {
			System.out.println(resu - odd(que+1));
		}
	}
	
	public static int odd(int sum) {
		while(sum % 2 == 0) {
			sum = sum >> 1;
		}
		System.out.println(sum);
		return sum;
	}
}
//////////////////////////////////超时