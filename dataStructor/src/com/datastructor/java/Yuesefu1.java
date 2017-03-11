package com.datastructor.java;

import java.util.Scanner;

//数组方法————约瑟夫问题
public class Yuesefu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入总人数：");
		int n=sc.nextInt();
		System.out.println("请输入报数的个数：");
		int m=sc.nextInt();
		int [] a=new int[n];
		int len=n;
		for(int i=0;i<n;i++){
			a[i]=i+1;
		}
		int i=0;
		int j=1;
		int size=0;
		StringBuffer sb=new StringBuffer();
		while(len>0){
			if(a[i%n]>0){
				if(j%m==0){
					System.out.println(a[i%n]+" ");
					sb.append(a[i%n]+" ");
					a[i%n]=-1;
					j=1;
					i++;
					len--;
				}else{
					i++;
					j++;
				}
			}else{
				i++;
			}
			size++;
		}
		
	}

}
