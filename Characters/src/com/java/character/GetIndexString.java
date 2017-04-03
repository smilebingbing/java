package com.java.character;

public class GetIndexString {

	public static void main(String[] args) {
		
	}
	
	public static char getIndexString(String str , int index){
		if(str == null || str.equals("") || index <= 0){
			return 0;		//字符编码为零表示空字符串
		}
		boolean stage = true;
		int num = 0;
		int sum = 0;
		char cur = 0;
		char [] ch = str.toCharArray();
		for(int i = 0;i < ch.length; i ++){
			if(ch[i] == '_'){
				stage = !stage;
			}else if(stage){
				sum += num;
				if(sum > index){
					return cur;
				}
				num = 0;
				cur = ch[i];
			}else{
				num = num * 10 + ch[i] - '0';
			}
		}
		return sum + num > index ? cur : 0;
	}
}