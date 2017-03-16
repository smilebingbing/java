package com.java.offer;
//把字符串转换成整数
public class Solution11 {

	public int StrToInt(String str){
		if(str.equals("") || str.length() == 0){
			return 0;
		}
		int q_valid = 0;
		char [] ch = str.toCharArray();
		if(ch[0] == '-'){
			q_valid=1;
		}
		int sum=0;
		for(int i = q_valid; i<ch.length ;i++){
			if(ch[i] == '+'){
				continue;
			}
			if(ch[i] < 48 || ch[i] > 57){
				return 0;
			}
				sum = sum*10 + ch[i]-48;
		
		}
		return  q_valid == 0 ? sum :sum*(-1);
	}
}
