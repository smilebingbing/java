package test;

import java.util.Scanner;

public class Question1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int resu;
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			resu = new Integer(Integer.parseInt(s, 7));
			System.out.println(resu);
		}
	}
}
