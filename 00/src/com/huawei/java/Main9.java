package com.huawei.java;

import java.util.Scanner;
import java.util.Stack;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack=new Stack<Integer>();
		StringBuffer sbf=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextLong();
			while(a!=0){
				stack.push((int) (a%2));
				a=a/2;
			}
			while(!stack.isEmpty()){
				sbf.append(stack.pop());
			}
			
		}
		System.out.println(Integer.valueOf(sbf.toString()));
	}

}
