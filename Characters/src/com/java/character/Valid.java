package com.java.character;
//将整数字符串转成整数值
public class Valid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(char [] ch){
		if(ch[0] == '-' || (ch[0] < '0' && ch[0] > '9')){
			return false;
		}
		
		if(ch[0] == '0' && ch.length == 1){
			return false;
		}
		
		if(ch[0] == '-' && (ch.length == 1 || ch[1] == '0')){
			return false;
		}
		
		for(int i = 0 ; i < ch.length; i ++){
			if(ch[i] < '0' || ch[i] > '9'){
				return false;
			}
		}
		return true;
	}
	
	public int convert(String str){
		if(str == null || str.equals("")){
			return 0;
		}
		char [] ch = str.toCharArray();
		if(!isValid(ch)){
			return 0;
		}
		boolean pos = ch[0] == '-' ? false : true;
		int minq = Integer.MIN_VALUE / 10;
		int minr = Integer.MIN_VALUE % 10;
		int res = 0;
		int cur = 0;
		for(int i = pos ? 0 : 1;i < ch.length;i ++){
			cur = '0' - ch[i];
			if((res < minq) || (res == minq && cur < minr)){
				return 0;
			}
			res = res * 10 + cur;
		}
		if(pos && res == Integer.MIN_VALUE){
			return 0;
		}
		return pos ? -res : res;
	}
}