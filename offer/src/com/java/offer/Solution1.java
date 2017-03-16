package com.java.offer;
//统计一个数字在排序数组中出现的次数
public class Solution1 {

	public int GetNumberOfK(int [] array, int k){
		int len=array.length;
		int count=0;
		for(int i=0;i< len; i++){
			if(array[i] == k){
				count++;
			}
		}
		return count;
	}
}
