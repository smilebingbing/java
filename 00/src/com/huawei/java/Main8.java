package com.huawei.java;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			str=str.substring(2);
			Integer a=Integer.valueOf(str, 16);
			String str1=Integer.toString(a);
			System.out.println(str1);
		}
	}

}
