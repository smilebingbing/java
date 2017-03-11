package com.huawei.oj;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int num=sc.nextInt();
			int k=sc.nextInt();
			int a []=new int[num];
			for(int i=0;i<num;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<k;i++){
				if(i==k-1){
					System.out.println(a[i]);
				}else{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
