package com.java.offer;
//左旋转字符串
/*
 * 我的思路就是：先将字符串转成字符数组，然后先将从n到最后的字符加入字符串中，
 * 然后再将前n个字符加入字符串中
 * 运行时间33ms
 * 占用内存629k
 */
public class Solution14 {

	public String LeftRotateString(String str, int n){
		if(str == null || n > str.length()){
			return "";
		}
		StringBuffer sb = new StringBuffer();
		char [] ch = str.toCharArray();
		for(int i = n; i < ch.length; i++){
			sb.append(ch[i]);
		}
		for(int i = 0; i < n; i++){
			sb.append(ch[i]);
		}
		return sb.toString();
	}
}
