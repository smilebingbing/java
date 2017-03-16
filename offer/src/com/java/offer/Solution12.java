package com.java.offer;
//扑克牌顺子 
/*
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，大小王可以看成任意数字
 * 基本思路：
 * 1. 先对数组排序，因为数组长度为7以下，所以可以忽略排序的时间复杂度
 * 2. 使用java自带的Arrays.sort()函数
 * 3. 先计算出数组中大小王的个数，设大小王看成零
 * 4. 计算数组中两个不连续的数字的间隔大小
 * 运行时间38ms
 * 占用内存639k
 */
import java.util.Arrays;

public class Solution12 {

	public boolean isContinuous(int [] numbers){
		if(numbers == null || numbers.length == 0){
			return false;
		}
		Arrays.sort(numbers);
		int number0 =0;
		for(int i=0; i < numbers.length-1; i++){
			if(numbers[i] == 0){
				number0 ++;
			}
		}
		//统计数组中间隔数目
		int numberGap=0;
		int small = number0;
		int big = small + 1;
		while(big < numbers.length ){
			//两个数相等，有对子，不可能是顺子
			if(numbers[small] == numbers[big]){
				return false;
			}
			numberGap +=numbers[big] - numbers[small] -1;
			small = big;
			big ++;
			
		}
		return numberGap > number0 ? false :true;
		
	}
}
