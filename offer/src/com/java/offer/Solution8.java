package com.java.offer;
//求1+2+3+...+n
/*
 * 要求不能使用乘除法，for\while\if\else\switch\case等关键字及条件判断语句
 * 左移运算符：num <<1,相当于num乘以2
 * 右移运算符：num >>1,相当于num除以2
 * 
 *
 *
 */
public class Solution8 {

public int Sum_Solution(int n) {
        /*int sum = 0;
        for(int i=1;i<= n;i++){
        	sum+=i;
        }
        return sum;
	
    }*/

	int sum=(int)(Math.pow(n, 2)+n);
	return sum >>1;
  }
}