package com.java.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Convert1 {
    public TreeNode Convert(TreeNode pRootOfTree) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
        InOrder(pRootOfTree ,queue);
        if(queue.isEmpty()){
        	return pRootOfTree;
        }
        pRootOfTree = queue.poll();
        TreeNode pre = pRootOfTree;
        pre.left = null;
        TreeNode cur = null;
        while(!queue.isEmpty()){
        	cur = queue.poll();
        	pre.right = cur;
        	cur.left = pre;
        	pre = cur;
        }
        pre.right = null;
        return pRootOfTree;
        
        
    }
    
    public void InOrder(TreeNode head , Queue<TreeNode> queue){
    	if(head == null){
    		return ;
    	}
    	InOrder(head.left, queue);
    	queue.offer(head);
    	InOrder(head.right, queue);
    	
    	
    }
}