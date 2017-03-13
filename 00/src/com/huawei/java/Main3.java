package com.huawei.java;
//十进制整数转二进制
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			System.out.println(Integer.toBinaryString(a));
		}
	}

}
