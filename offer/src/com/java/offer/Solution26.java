package com.java.offer;
//从上往下打印二叉树
//考察层次遍历，用队列
import java.util.ArrayList;
import java.util.LinkedList;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
运行时间28ms
占用内存629k
*/
public class Solution26 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
        	return new ArrayList<Integer>();
        }
    	ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode cur = null;
        queue.offer(root);
        while(!queue.isEmpty()){
        	cur = queue.poll();
        	list.add(cur.val);
        	if(cur.left != null){
        		queue.offer(cur.left);
        	}
        	if(cur.right != null){
        		queue.offer(cur.right);
        	}
        	
        }
        return list;	
    }
    
}
