package day_huawei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			System.out.println(getSequeOddNum(a));
		}
	}
	
	public static String getSequeOddNum(int n){
		int leftOdd=n*n-(n-1);
		int rightOdd=n*n+(n-1);
		StringBuilder strb=new StringBuilder();
		for(int i=leftOdd;i<=rightOdd;i+=2){
			strb.append(i).append('+');
		}
		return strb.substring(0, strb.length()-1);
	}

}
