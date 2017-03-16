package com.java.offer;
//不用加减乘除做加法
/*
 * 1. 考虑位运算，
 * 2. 不考虑进位，对每一位相加，0+0=0,0+1=1,1+0=1,1+1=0,和异或的结果是相同的
 * 3. 考虑进位，0+0,1+0,0+1都不会产生进位，想象成两个数先做位与运算，然后再向左移动一位，
 * 		只有两个数都是1时，
 * 4. 把前两步的结果相加，相加的过程依然是重复前两步，直到不产生进位为止。
 */
public class Solution10 {

	public int Add(int num1,int num2) {
        int sum,carry;
        while(num2!=0){
        	sum = num1 ^ num2;
        	carry = (num1 & num2) << 1;
        	num1 = sum;
        	num2 = carry;
        }
        return num1;
    }
}
