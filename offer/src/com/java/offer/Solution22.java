package com.java.offer;
//丑数
/*
 * 只包含因子2,3,5的数称为丑数，1是第一个丑数
 * 
 * 未通过
 * 貌似复杂度过大
 */
public class Solution22 {

	public int GetUglyNumber_Solution(int index) {
		if(index <= 0){
			return 0;
		}
		int count = 0;
		int uglynumber = 0;
		while(uglynumber < index){
			count ++;
			if(isUgly(count)){
				uglynumber ++;
			}
		}
        return count;
    }
	
	public boolean isUgly(int number){
		while(number % 2 == 0){
			number /=2;
		}
		while(number % 3 ==0){
			number /=3;
		}
		while(number % 5 ==0){
			number /=5;
		}
		
		if(number == 1){
			return true;
		}else{
			return false;
		}
	}
}