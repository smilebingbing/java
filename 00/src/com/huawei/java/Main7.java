package com.huawei.java;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			long a=sc.nextLong();
			String aa=Integer.toOctalString((int) a);
			System.out.println(Integer.valueOf(aa));
		}
	}

}
