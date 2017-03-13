package com.huawei.java;
//快速排序   递减
/*
 * 存在问题，有一个最大的元素不是按序排列的，不知道问题在哪
 * 
 */
import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {

		int [] data={70,30,40,10,80,20,90,100,75,60,45};
		data=quickSort(data, 0, 10);
		System.out.println(Arrays.toString(data));
		
	}

	public static int[] quickSort(int[] data,int low, int high){
		if(low>high){
			return null;
		}
		int i=low+1;
		int j=high;
		int temp;
		int pivot=data[low];
		while(i<j){
			while(i < j && data[i] >= pivot){
				i++;
			}
			while(i <= j && data[j] <= pivot){
				j--;
			}
			if(i<j){
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		if(low<j){
			temp = data[low];
			data[low] =data[j];
			data[j] =temp;
		}
		quickSort(data,low,j-1);
		quickSort(data,j+1,high);
		return data;
	}
}