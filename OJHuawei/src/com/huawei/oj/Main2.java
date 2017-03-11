package com.huawei.oj;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.nextLine();
			bubbleSort(s);
		}
	}
	
	public static void bubbleSort(String s){
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<ch.length-1;j++){
				if(ch[i]>ch[i+1]){
					char temp=ch[i];
					ch[i]=ch[i+1];
					ch[i+1]=temp;
				}
			}
		}
		System.out.println(ch);
	}

}
