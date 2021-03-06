package com.java.offer;
//二维数组中的查找
/*
 * 基本思想：因为二维数组每行和每列都是按序排列的，所以选取右上角的元素与目标元素
 * 		进行比较，如果目标元素大于右上角元素，则删除右上角元素所在的行，
 * 		若目标元素小于右上角元素，则删除右上角元素所在的列
 * 		
 * 运行时间158ms
 * 占用内存5000k
 */

public class Solution4 {

	public boolean Find(int target, int [][] array){
		int rows = array.length;
		int columns = array[0].length;
		boolean found=false;
			int row = 0;
			int column = columns-1;
			while(row < rows && column >=0){
				if(array[row][column] == target){
					found=true;
					break;
				}else if(array[row][column] < target){
					row++;
				}else{
					column--;
				}
			}
		return found;
	}
}
