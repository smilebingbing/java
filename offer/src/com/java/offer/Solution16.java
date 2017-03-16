package com.java.offer;
import java.util.*;
//和为S的两个数字
/*
 * 运行时间36ms
 * 占用内存654k
 * 需要返回一个空ArrayList时，要return new ArrayList<Integer>();这样写
 * 
 */
public class Solution16 {

	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(array.length < 1 || sum <=0){
			return new ArrayList<Integer>();
		}
		int len = array.length;
		int left = 0;
		int right = len-1;
		while(left < right){
			if(array[left] + array[right] == sum ){
				list.add(array[left]);
				list.add(array[right]);
				left ++;
				right --;
				break;
			}else if(array[left] + array[right] > sum){
				right --;
			}else{
				left ++;
			}
		}
		if(list.isEmpty()){
			return new ArrayList<Integer>();
		}else{
			return list;
		}
	}
}
