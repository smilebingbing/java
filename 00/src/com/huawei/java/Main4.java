package com.huawei.java;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			Integer inte=Integer.valueOf(str);
			System.out.println(Integer.toBinaryString(inte));
			
		}
	}

}
