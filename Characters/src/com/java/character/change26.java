package com.java.character;
//26进制转10进制
import java.math.BigInteger;
import java.util.Scanner;


public class change26 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
//			String str = sc.nextLine();
//			int resu = 0;
//			char [] ch = str.toCharArray();
//			int radios = 1;
//			for(int i = ch.length - 1;i >= 0;i --){
//				resu += (ch[i] - 'a') * radios;
//				radios *= 26;
//			}
//			System.out.println(resu);
//		}
	
	
	Scanner sc = new Scanner(System.in);
	char[] chars = new char[6];
	while(sc.hasNext()) {
		String str = sc.nextLine();
		BigInteger resu = new BigInteger("0");
		char[] ch = str.toCharArray();
		BigInteger radios = new BigInteger("1");
		for(int i = ch.length;i >= 0; i --) {
			resu = resu.add(new BigInteger(Integer.toString(ch[i] - 'a')) .multiply(radios));
			radios.multiply(new BigInteger("26"));
		}
		System.out.println(resu);
	}
	
		
		
		


	}
}