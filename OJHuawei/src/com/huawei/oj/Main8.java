package com.huawei.oj;

import java.util.Scanner;

//24点游戏算法
public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int [] num=new int[4];
			for(int i=0;i<4;i++){
				num[i]=sc.nextInt();
			}
			System.out.println(getResult(num,0,0));
		}
	}

	private static boolean getResult(int [] num,int i,int result){
		if(result==24){
			return true;
		}
		
		if(i<4){
			return getResult(num,i+1,result+num[i])
					||getResult(num,i+1,result-num[i])
					||getResult(num,i+1,result==0?0:result*num[i])
					||getResult(num,i+1,result==0?0:result/num[i]);
		}else
			return false;
	}
}
