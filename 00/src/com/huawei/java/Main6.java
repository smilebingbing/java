package com.huawei.java;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			char[] ch=str.toCharArray();
			int len=ch.length;
			int num=0;
			for(int i=len-1;i>=0;i--){
				int bit=Integer.valueOf(ch[i]-'0');
				num+=bit*Math.pow(7,len-i-1);
			}
			System.out.println(num);
		}
	}

}
