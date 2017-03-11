package com.atguigu.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput {

	public String nextString(){
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	public int nextInt(){
		return Integer.parseInt(nextString());
	}
	
	public boolean nextBoolean(){
		return Boolean.parseBoolean(nextString());
	}
	
	public static void main(String[] args) {
		MyInput i =new MyInput();
		System.out.println("请输入一个字符串：");
		String str=i.nextString();
		System.out.println(str);
		
	}
}
