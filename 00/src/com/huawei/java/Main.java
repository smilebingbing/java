package com.huawei.java;


import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String str=sc.next();
    		
            long decimal1=0;
		
			char[] ch=str.toCharArray();
			for(int i = ch.length - 1; i >= 0; i--){
				int bits = Integer.valueOf(ch[i]-'0');
				decimal1+= bits * Math.pow(7, ch.length-1 - i);
			}

			
			System.out.println(String.valueOf(decimal1)); 
        }
			
    }	
	

}

