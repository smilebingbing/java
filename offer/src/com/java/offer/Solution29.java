package com.java.offer;
//对称的二叉树
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution29 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
        	return true;
        }
        return isSymmetric(pRoot.left, pRoot.right);
    }
    public boolean isSymmetric(TreeNode left , TreeNode right){
    	if(left == null && right == null){
    		return true;
    	}
    	else if(left == null || right == null){
    		return false;
    	}
    	
    	return left.val == right.val && isSymmetric(left.left, right.right)
    			&& isSymmetric(left.right, right.left);
    	
    }
}
