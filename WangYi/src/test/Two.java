package test;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		change(str);
	}
	
	public static String change(String str){
		int a = Integer.parseInt(str, 16);
		String s = Integer.toString(a, 3);
		System.out.println(s);
		return s;
	}
}