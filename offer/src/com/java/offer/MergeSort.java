package com.java.offer;
//归并排序
public class MergeSort {

	public void merge(int [] data,int len){
		int m = 0;
		int b1 = 0;
		int t1;
		int b2;
		int t2;
		int i = 0;
		int j = 0;
		int [] array=new int[data.length];
		while(i+len<data.length){
			b2=len+1;
			t1=b1-1;
			t2=(b2+len-1)<data.length ? b2+len-1 : data.length-1;
			j=b2;
			i=b1;
			while((i <= t1)&& (j <= t2)){
				if(data[i] <= data[j]){
					array[m++] = data[i++];
				}else{
					array[m++] = data[j++];
				}
			}	
				while(i<=t1){
					array[m++] = data[i++];
				}
				while(j <= t2){
					array[m++] = data[i++];
				}
				b1=t2+1;
			}
		i=b1;
		while(i<data.length){
			array[m++] = data[i++];
		}
		
		for(i=0;i<data.length; i++){
			data[i] = array[i];
		}
		
	}
	
	public int[] mergeSort(int [] data){
		int k=1;
		while(k< data.length){
			merge(data,k);
			k*=2;
		}
		return data;
		
	}
}