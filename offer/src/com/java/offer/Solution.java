package com.java.offer;
//数组中出现次数超过一半的数字
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        
		int len=array.length;
		quickSort(array, 0, len);
		int count=0;
		for(int i=0; i < len;i++){
			if(array[i]==array[len/2]){
				count++;
			}
		}
		if(count > (len/2)){
			return array[len/2];
		}else{
			return 0;
		}
		
    }
	
	public static int[] quickSort(int [] array , int low,int high){
		if(low < high){
			return null;
		}
		int i=low+1;
		int j=high;
		int pivot=array[low];
		int temp;
		while(i<j){
			while(i<j && array[i]<= pivot){
				i++;
			}
			while(i<= j && array[j]>= pivot){
				j--;
			}
			if(i < j){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		if(low < j){
			temp = array[j];
			array[j] = array[low];
			array[low] = temp;
		}
		quickSort(array, low ,j-1);
		quickSort(array, j+1 ,high);
		return array;
	}


}