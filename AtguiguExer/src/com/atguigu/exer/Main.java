package com.atguigu.exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args){
		String str="  ab c de  ";
		String str1=myTrim(str);
		System.out.println(str1);
	}
	
		// TODO Auto-generated method stub

		//模拟一个trim()方法，去除字符串两端的空格
		
		//将一个字符串进行反转，将字符串中指定部分进行反转
		
		//获取一个字符串在另一个字符串中出现的次数
	public static String myTrim(String str){
		int start=0;
		int end = str.length()-1;
		while(str.charAt(start)==' '){
			start++;
		}
		while(str.charAt(end)==' '){
			end--;
		}
		
		return str.substring(start,end+1);
		
	}
	
	public static String ReverseString(String str,int start,int end){
		char [] ch =str.toCharArray();
		return reverseArray(ch,start,end);
	}

	private static String reverseArray(char[] ch, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=start,j=end;i<j;i++,j--){
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		return new String(ch);//字符数组转换成字符串
	}
	
	//第二种方法
	public static String reverseString1(String str,int start,int end){
		String str1=str.substring(0,start);
		for(int i=end;i>=start;i--){
			char c=str.charAt(i);
			str1+=c;
		}
		
		str1+=str.substring(end+1);
		return str1;
	}
	
	//3.获取一个字符串在另一个字符串中出现的次数,判断str2在str1中出现的次数
	public static int getTime(String str1,String str2){
		    int count=0;
		    int len;
		    while((len=str1.indexOf(str2))!=-1){
		    	count++;
		    	str1=str1.substring(len+str2.length());
		    }
		    return count;
	}

	//获取两个字符串中最大相同子串
	
	public static String getMaxSubString(String str1,String str2){
		String maxStr=(str1.length()>str2.length())? str1:str2;
		String minStr=(str1.length()<str2.length())? str1:str2;
		
		int len=minStr.length();
		for(int i=0;i<len;i++){
			for(int x=0,y=len-i;y<len;y--){
				String str=minStr.substring(x, y);
				if(maxStr.contains(str)){
					return str;
				}
			}
		}
		return null;
	}
	
	public static List<String> getMaxSubString1(String str1,String str2){
		String maxStr=(str1.length()>str2.length())? str1:str2;
		String minStr=(str1.length()<str2.length())? str1:str2;
		
		int len=minStr.length();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<len;i++){
			for(int x=0,y=len-i;y<len;y--){
				String str=minStr.substring(x, y);
				if(maxStr.contains(str)){
					list.add(str);
				}
			}
			if(list.size()!=0){
				return list;
			}
		}
		return null;
	}
	
	
	
	//对字符串中字符进行自然顺序排序
	//提示：字符串变成字符数组
	//对数组排序，选择，冒泡，Arrays.sort();
	//将排序后的数组变成字符串
	public static String sort(String str){
		char [] ch =str.toCharArray();
		Arrays.sort(ch);
		
		return new String(ch);
	}
}
