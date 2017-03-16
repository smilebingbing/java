package com.java.offer;
//旋转数组中的最小数字
/*
 * 运行时间141ms
 * 占用内存4040k
 */
public class Solution7 {

public int minNumberInRotateArray(int [] array) {
	    
        int len=array.length;
        int index1=0;
        int index2=len-1;
        int indexMid = index1;
        while(array[index1] >= array[index2]){
        	if(index2 - index1 ==1){
        		indexMid = index2;
        		break;
        	}
        	indexMid=(index1 + index2)/2;
        	if(array[indexMid] >= array[index1]){
        		index1 = indexMid;
        	}else if(array[indexMid] <= array[index2]){
        		index2 = indexMid;
        	}
        }
        return array[indexMid];
    }
}
