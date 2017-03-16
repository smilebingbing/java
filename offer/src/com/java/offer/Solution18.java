package com.java.offer;
//二叉树的深度
/*
 * 问题：输入一棵二叉树，求该树的深度
 * 递归算法：递归根的左子树
 * 			递归根的右子树
 * 判断二者大小，返回二者之中的大值加一
 * 运行时间：32ms
 * 占用内存：503k
 */
public class Solution18 {

public int TreeDepth(TreeNode root) {
        if(root == null){
        	return 0;
        }
        
        int h_left = TreeDepth(root.left);
        int h_right = TreeDepth(root.right);
        return (h_left > h_right) ? (h_left + 1) :(h_right + 1);
    }
}