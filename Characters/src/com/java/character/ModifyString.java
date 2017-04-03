package com.java.character;
//调整字符串
public class ModifyString {

	public static void modify(char [] ch){
		if(ch == null || ch.length == 0){
			return ;
		}
		int len = ch.length - 1;
		for(int i = ch.length - 1; i >= 0; i --){
			if(ch[i] != '*'){
				ch[len --] = ch[i];
			}
		}
		for(;len > -1;){
			ch[len --] = '*';
		}
	}
}