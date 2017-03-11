package com.atguigu.java;

//将一个字符串反转


/*
public class TestString {

	public static String reverse(String str){
		char [] ch = str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>0;i--){
			System.out.print(ch[i]);
		}
		return null;
	}
	
*/
//方法一



public class TestString{
	
	
	public static void main(String[] args) {
		String str=reverse("helloworld");
		System.out.println(str);
		
		String str1=reverse1("helloworld");
		System.out.println(str1);
		
		String str2=reverse2("helloworld");
		System.out.println(str2);
	}
	
	
	//方法一
	public static String reverse(String str){
		char [] ch =str.toCharArray();
		for(int x=0,y=ch.length-1;x<y;x++,y--){
			char tmp=ch[x];
			ch[x]=ch[y];
			ch[y]=tmp;
	}
		return new String(ch);
}	
		
		//方法二	
		public static String reverse1(String str){
			StringBuffer stb=new StringBuffer(str);
			StringBuffer sb=stb.reverse();
			return sb.toString();
		}
		
		
		//方法三：
		
		public static String reverse2(String str){
			StringBuffer sb=new StringBuffer();
			for(int i=str.length()-1;i>=0;i--){
				sb.append(str.charAt(i));
			}
			return sb.toString();
		}
		
}
	
	

	
	
	
	
	


