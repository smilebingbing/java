package com.java.offer;
//二叉搜索树的后序遍历序列
/*
 * 二叉搜索树就是二叉排序树,根的左子树的值比根节点值小，根的右子树的值比根节点值大
 */
public class Solution27 {

	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length <= 0 ){
        	return false;
        }
        return isSortTree(sequence, 0, sequence.length-1);
        
	}
	
	public boolean isSortTree(int [] sequence ,int start , int end){
	
		if(start >= end){
			return true;
		}
		int i = start;
		for(;i < end;i++){
			if(sequence[i] > sequence[end]){
				break;
			}
		}
		int j = i;
		for(;j < end;j++){
			if(sequence[j] < sequence[end]){
				return false;
			}
		}
		return isSortTree(sequence, start, i-1) && isSortTree(sequence, i, end-1);
	
	
	
	}
}
