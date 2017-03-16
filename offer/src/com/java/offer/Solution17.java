package com.java.offer;
//和为S的连续正数序列
/*
 * 通过
 * 基本思路：
 * 1. 写一个打印连续数字的函数，返回值为链表
 * 2. 定义一个链表里面是链表的链表
 * 3. 初始化small =1 ,big = 2;最多循环到和加一的一半的位置
 * 4. 当前和为cursum，若small+big=cursum,则添加到结果集中
 * 5. 若当前cursum > sum,则在当前和中减去small,然后small+1;如果等于sum，则添加到结果集中
 * 6. 否则，big+1,当前和加上big
 */
import java.util.ArrayList;
public class Solution17 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
       if(sum < 3){
    	   return new ArrayList<ArrayList<Integer>>();
       }
       int small = 1;
       int big = 2;
       int cursum = small + big;
       while(small < (1+sum)/2){
    	   if(cursum == sum){
    		   list.add(printContinusSequence(small, big));
    	   }
    	   while(cursum > sum && small < (1+sum)/2){
    		   cursum -=small;
    		   small ++;
    		   
    		   if(cursum == sum){
    			   list.add(printContinusSequence(small, big));
    		   }
    	   }
    	   big ++;
    	   cursum +=big;
       }
       return list;
    }  

       public ArrayList<Integer> printContinusSequence(int small, int big){
       	   ArrayList<Integer> arrlist = new ArrayList<Integer>();
    	   for(int i = small;i <= big;i++){
    		  arrlist.add(i);
    	  }
    	  return arrlist;
       }
    
}