package com.java.offer;
//重建二叉树
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//运行时间206ms
//占用内存5013k
public class Solution32 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	TreeNode root = construct(pre, 0 , pre.length - 1,in ,0 , in.length-1);
    	return root;
        
    }
    
    public static TreeNode construct(int [] pre, int start_pre, int end_pre, int [] in, int in_start, int in_end){
    	if(start_pre > end_pre || in_start > in_end){
    		return null;
    	}
    	TreeNode root = new TreeNode(pre[start_pre]);
    	for(int i = in_start; i <= in_end; i++){
    		if(in[i] == pre[start_pre]){
    			root.left = construct(pre, start_pre + 1, start_pre + i - in_start,in, in_start,i-1);
    			root.right = construct(pre,start_pre + i - in_start + 1,end_pre,in ,i+1,in_end);
    		}
    		
    	}
    	return root;
    }
}
