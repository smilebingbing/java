package com.java.character;
//字符串的统计字符串
import java.util.Scanner;

public class GetCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(getCountString(str));
	}

	public static String getCountString(String str){
		if(str == null || str.equals("")){
			return "";
		}
		char [] ch = str.toCharArray();
		String res = String.valueOf(ch[0]);
		int num = 1;
		for(int i = 1 ;i < ch.length; i ++){
			if(ch[i] == ch[i - 1]){
				num ++;
			}else{
				res = res + "_" + num + "_" + ch[i];
				num = 1;
			}
		}
		return res + "_" + num;
	}
}