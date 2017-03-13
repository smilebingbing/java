package com.huawei.java;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			Integer inte=Integer.valueOf(str,7);
			System.out.println(inte);
			
		}
	}

}
