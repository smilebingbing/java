package com.huawei.java;

import java.util.Arrays;

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data={10,2,1,13,0};
		data=insertSort(data);
		System.out.println(Arrays.toString(data));
		
	}

	public static int[] insertSort(int [] data){
		int k;
		int temp;
		for(int i=0;i<data.length-1;i++){
			k=i;
			for(int j=i+1;j<data.length;j++){
				if(data[j]<data[k]){
					k=j;
				}
			}
			if(k!=i){
				temp=data[i];
				data[i]=data[k];
				data[k]=temp;
			}
		}
		return data;
	}
}