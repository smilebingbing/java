package com.java.character;

import java.util.HashMap;
import java.util.Map;

//判断两个字符串是否互为变形词
public class isDeformation {

	public boolean isDeformation(String str1 , String str2){
		if(str1 == null || str2 == null || str1.length() != str2.length()){
			return false;
		}
		
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		int [] map = new int[256];
		for(int i = 0 ; i < ch1.length ;i ++){
			map[ch1[i]] ++;
		}
		
		for(int i = 0 ; i < ch2.length ;i ++){
			if(map[ch2[i]] -- == 0){
				return false;
			}
		}
		return true;
	}

//	public boolean isDeformation1(String str1,String str2){
//		if(str1 == null || str2 == null || str1.length() != str2.length()){
//			return false;
//		}
//		
//		char [] ch1 = str1.toCharArray();
//		char [] ch2 = str2.toCharArray();
//		Map<Character , Integer> map = new HashMap<>();
//		for(int i = 0; i < ch1.length ; i ++){
//			if()
//		}
//	}
}