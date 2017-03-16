package com.java.offer;
// 旋转数组的最小数字
/*
 * 运行时间146ms
 * 占用内存3960k
 */
import java.util.Arrays;

public class Solution6 {

	public int minNumberInRotateArray(int [] array) {
	    
        int len = array.length;
        int min = array[0];
        for(int i=1;i<len ;i++){
        	
        	if(array[i] < min){
        		min = array[i];
        	}
        }
        return min;
    }
}
