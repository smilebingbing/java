package com.huawei.oj;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.nextLine();
			char [] ch=s.toCharArray();
			Arrays.sort(ch);
			System.out.println(ch);
		
	 }
	}
}
