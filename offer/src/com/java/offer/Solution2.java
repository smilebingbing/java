package com.java.offer;
//数组中只出现一次的数字
/*
 * 1.使用异或运算，如果数组中只有一个只出现一次，剩下的出现两次，任何一个数字
 * 	异或它自己等于零，所以异或数组中的每个数，最后得到的结果就是只出现
 * 	一次的数字
 * 2.当数组中有两个数字各只出现一次，那么异或结果就是这两个数字的异或，根据结果二进制中1出现的位置
 * 		将数组分成两类，第一类是刚才记录1的位置是1，另一类是记录的位置是0，则这个两个数组中各只有一个
 * 		数字出现一次。异或之后，找到它们。
 */
import java.util.Arrays;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution2 {

public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        int res = 0;
        for(int i=0;i < len;i++){
        	res^=array[i];
        }
        
    }
}
