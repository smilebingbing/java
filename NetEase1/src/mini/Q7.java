package mini;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		sc.close();
		int A = 0,B = 0,C = 0;
		if((one + three) % 2 == 0){
			A = (one+three)/2;
		} else {
			System.out.println("No");
			return ;
		}
		
		B = A - one;
		C = B - two;
		
		if(A < 0 || B < 0 || C < 0) {
			System.out.println("No");
			return;
		}
		if(C + B != four) {
			System.out.println("No");
			return;
		}
		System.out.println(A + " " + B + " " + C);
		
	}
}
