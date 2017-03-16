package com.java.offer;
//整数中1出现的次数(从1到n整数中1出现的次数)
/*
 * 当数字n的位数十分大时，它的时间复杂度非常大
 */
public class Solution3 {
	public int NumberOf1Between1AndN_Solution(int n) {
	    int number=0;
	    for(int i=1;i<=n;i++){
	    	number += NumberOf1(i);
	    }
	    return number;
    }
	
	public int NumberOf1(int n){
		int number = 0;
		while(n!=0){
			if(n % 10 == 1){
				number++;
			}
			n=n/10;
		}
		return number;
	}
}
