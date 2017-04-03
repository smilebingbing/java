package com.java.character;

import java.util.Scanner;

public class Replace {
//替换字符串
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char [] ch = str.toCharArray();
		System.out.println(replace(ch));
	}

	public static String replace(char [] ch){
		if(ch == null || ch.length == 0){
			return ch.toString() ;
		}
		int num = 0;
		for(int i = 0; i < ch.length; i ++){
			if(ch[i] == ' '){
				num ++;
			}
		}
		int j = ch.length + num * 2 - 1;
		for(int i = ch.length - 1;i >= 0; i --){
			if(ch[i] != ' '){
				ch[j--] = ch[i];
			}else{
				ch[j --] = '0';
				ch[j --] = '2';
				ch[j --] = '%';
			}
		}
		return ch.toString();
	}
}