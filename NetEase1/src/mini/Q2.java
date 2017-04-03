package mini;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		double dinput = (double)input;
		int sum = 0;
		for(int i = 0;i < Math.sqrt(input);i ++) {
			double length = dinput - Math.pow(i, 2);
			int resu = (int) Math.sqrt(length);
			if(Math.pow(resu, 2) == length) {
				sum ++;
				//System.out.println(resu + " " + i);
			}
		}
		System.out.println(sum * 4);
		
	}
}
