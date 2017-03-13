package model;
//最小的K个数
/*
 * 方法一：
 * 使用Arrays.sort()函数对数组排序
 * 然后取前k个数
 * 但这种方法时间复杂度是O(n^2)
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
    	int len=input.length;
        if(k>len){
        	return list;
        }
    	Arrays.sort(input);
        for(int i=0;i<k;i++){
        	list.add(input[i]);
        }
        return list;
    }
    
    
}
