package day_huawei;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String str1=sc.next();
			String str2=sc.next();
			getCommanStrLength(str1, str2);
		}
	}
	/*
	public static int getCommanStrLength(String str1,String str2){
		String maxStr=(str1.length()>str2.length())?str1:str2;
		String minStr=(str1.length()<str2.length())?str1:str2;
		
		int len=minStr.length();
		int count=0;
		for(int i=0;i<len;i++){
			for(int x=0,y=len-i;y<len;y--){
				String str=minStr.substring(x,y);
				if(maxStr.contains(str)){
					count=str.length();
				}
			}
		}
		return count;
	}
	*/
	
	public static void getCommanStrLength(String str1,String str2){
		String maxStr=(str1.length()>str2.length())?str1:str2;
		String minStr=(str1.length()<str2.length())?str1:str2;
		
		int len=minStr.length();
		int count=0;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<=len;j++){
				if(maxStr.contains(minStr.substring(i,j))&&j-i>count){
					count=j-i;
				}
			}
		}
		System.out.println(count);
	}
}
