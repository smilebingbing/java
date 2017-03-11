package com.offer.java;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr ={2,1,15,20,9,30,10,0};
		int k=4;
		arr=findArrSort(arr, k);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] findArrSort(int [] arr, int k){
		for(int i=0;i<k-1;i++){
			for(int j=0;j<k-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=k;i<arr.length-1;i++){
			for(int j=k;j<arr.length-1;j++){
				if(arr[j]<arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		return arr;
		
	}
}
