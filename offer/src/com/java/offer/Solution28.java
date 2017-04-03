package com.java.offer;
//二叉搜索树与双向链表
//错的，运行没通过
import java.util.LinkedList;
import java.util.Queue;

public class Solution28 {

	public TreeNode Convert(TreeNode pRootOfTree) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		InOrder(pRootOfTree , queue);
		while(queue.isEmpty()){
			return pRootOfTree;
		}
		TreeNode pre = pRootOfTree;
		pre.left = null;
		TreeNode cur = pRootOfTree;
		while(!queue.isEmpty()){
			cur = queue.poll();
			pre.right = cur;
			cur.left = pre;
			pre = cur;
			
		}
		cur.right = null;
		return pRootOfTree;
		
	}
	
	public void InOrder(TreeNode pRootOfTree, Queue<TreeNode> queue){
		if(pRootOfTree == null){
			return ;
		}
		InOrder(pRootOfTree.left, queue);
		queue.offer(pRootOfTree);
		InOrder(pRootOfTree.right, queue);
	}
    
}