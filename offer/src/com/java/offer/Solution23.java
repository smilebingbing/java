package com.java.offer;
//丑数
/*
 * 运行时间37ms
 * 占用内存654k
 * 
 * 不完全理解
 */
public class Solution23 {

	public int GetUglyNumber_Solution(int index) {
	
		if(index <=0){
			return 0;
		}
		int [] res = new int[index];
		int begin = 1;
		int m2 = 0, m3 = 0, m5 = 0;
		res[0] = 1;
		while(begin < index){
			res[begin]=Min(res[m2]* 2, res[m3]*3, res[m5]*5);
			while((res[m2]*2) <= res[begin]){
				m2 ++;
			}
			while((res[m3]*3) <= res[begin]){
				m3 ++;
			}
			while((res[m5]*5) <= res[begin]){
				m5 ++;
			}
			begin ++;
		}
		return res[index-1];
		
	}
	public int Min(int m2,int m3,int m5){
		int min = (m2 > m3) ? m3 : m2;
		min = (min > m5) ? m5 :min;
		return min;
	}
}