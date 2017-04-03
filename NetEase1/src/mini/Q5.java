package mini;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
//		System.out.println(a);
//		System.out.println(b);
		StringBuffer stra = new StringBuffer(a+"");
		StringBuffer strb = new StringBuffer(b+"");
		
		stra = stra.reverse();
		strb = strb.reverse();
		
		int sum = Integer.parseInt(stra.toString()) + Integer.parseInt(strb.toString());
		//System.out.println(sum);
		StringBuffer resu = new StringBuffer(sum+"");
		resu = resu.reverse();
		System.out.println(Integer.parseInt(resu.toString()));
	}
	
}
