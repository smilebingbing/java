package com.offer.java;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] data={5,4,2,1,3};
		data=insertSort(data);
		System.out.println(data);
		
	}

	public static int [] insertSort(int [] data){
		for(int i=1;i<data.length;i++){
			if(data[i]<data[i-1]){
				int temp=data[i];
				int j=0;
				for(j=i-1;j>=0&&data[j]>temp;j--){
					data[j+1]=data[j];
				}
				data[j+1]=temp;
			}
		}
		return data;
	}
}
