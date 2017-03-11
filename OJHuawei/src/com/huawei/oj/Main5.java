package com.huawei.oj;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int num=sc.nextInt();
			int first=num/2;
			int small=first;
			int big=first;
			for(int i=0;i<=first;i++){
				if(PrimeNumber(small)&&PrimeNumber(big)){
					break;
				}
				small=first-i;
				big=first+i;
			}
			System.out.println(small);
			System.out.println(big);
		}
		
	}
	
	public static boolean PrimeNumber(int n){
		if(n<2){
			return false;
		}
		if(n==2){
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
