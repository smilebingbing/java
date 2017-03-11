package com.huawei.oj;
//查找输入整数二进制中1的个数
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			Integer number=sc.nextInt();
			String str=number.toBinaryString(number);
			int count=0;
			char [] ch=new char[str.length()];
			for(int i=0;i<str.length();i++){
				ch[i]=str.charAt(i);
				if(ch[i]=='1'){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}

