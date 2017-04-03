package com.java.character;

import java.util.Scanner;

//去掉字符串中连续出现K个0的子串
public class RemoveKZeros {

	public static String removeKZeros(String str, int k){
		if(str == null || k < 1){
			return str;
		}
		
		char [] ch = str.toCharArray();
		int count = 0;
		int start = -1;
		for(int i = 0; i < ch.length; i ++){
			if(ch[i] == '0'){
				count ++;
				start = start == -1 ? i : start;
			}else{
				if(count == k){
					while(count -- != 0){
						ch[start ++] = 0;
					}
				}
				count = 0;
				start = -1;
			}
		}
		if(count == k){
			while(count -- != 0){
				ch[start ++] = 0;
			}
		}
		return String.valueOf(ch);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			int k = sc.nextInt();
			System.out.println(removeKZeros(str,k));
		}
	}
}