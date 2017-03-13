package com.offer.java;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data={5,4,2,1,3};
		data=selectSort(data);
		System.out.println(Arrays.toString(data));
		
	}
	
	public static int [] selectSort(int [] data){
		for(int i=0;i<data.length-1;i++){
			int k=i;
			for(int j=i+1;j<data.length;j++){
				if(data[j]<data[k]){
					k=j;
				}
			}
			if(k!=i){
				int temp=data[i];
				data[i]=data[k];
				data[k]=temp;
			}
		}
		return data;
	}
}
