package com.java.offer;
//判断二叉树是不是平衡二叉树
/*
 * 递归算法
 * 运行时间36ms
 * 占用内存503k
 */
public class Solution19 {

	public boolean IsBalance(TreeNode root){
		if(root == null){
			return true;
		}
		
		int h_left = TreeDepth(root.left);
		int h_right = TreeDepth(root.right);
		
		int diff = h_left - h_right;
		if(diff < -1 || diff > 1){
			return false;
		}
		
		return IsBalance(root.left) && IsBalance(root.right);
		
	}
	
	public int TreeDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        int h_left = TreeDepth(root.left);
        int h_right = TreeDepth(root.right);
        return (h_left > h_right) ? (h_left + 1) :(h_right + 1);
    }


}
