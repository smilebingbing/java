package com.java.character;
//字符串中数字子串的求和
public class NumSum {

	public int numSum(String str){
		if(str == null){
			return 0;
		}
		int res = 0;
		int num = 0;
		boolean pos = true;
		int cur = 0;
		char [] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i ++){
			cur = ch[i] - '0';
			if(cur < 0 || cur > 9){
				res += num;
				num = 0;
				if(ch[i] == '-'){
					if(i - 1 > -1 && ch[i - 1] == '-'){
						pos = !pos;
					}else{
						pos = false;
					}
				}else{
					pos = true;
				}
				
			}else{
				num = num * 10 + (pos ? cur : - cur);
			}
		}
		res += num;
		return res;
	}
}