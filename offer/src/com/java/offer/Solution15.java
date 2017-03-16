package com.java.offer;
//翻转单词顺序列
/*
 * 用字符串的trim()方法去掉字符串开头和结尾的空格
 */
public class Solution15 {

	public String ReverseSentence(String str){
		if(str == null){
			return null;
		}
		if(str.length() == 0){
			return "";
		}
		/*char [] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = ch.length-1;
		while(i < j){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
			i++;
			j--;
		}
		for(int k=ch.length-1;k > 0; k--){
			sb.append(ch[k]);
		}
		return sb.toString();*/

		if(str.trim().equals("")){
			return str;
		}
		String word[] = str.split(" ");
		int len = word.length;
		StringBuffer sb = new StringBuffer(word[len-1]);
		for(int i = len-2;i >= 0;i --){
			sb.append(" "+word[i]);
		}
		return sb.toString();
	}
	
	

}