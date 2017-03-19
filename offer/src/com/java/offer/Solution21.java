package com.java.offer;
//把二叉树打印成多行
/*
 * 从上层到下层打印二叉树，同一层结点从左至右输出。
 * 
 * 运行时间37ms
 * 占用内存588k
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution21 {

	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(pRoot == null){
			return result;
		}
		int start = 0;
		int end = 1; //end记录每层节点数目
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode cur = null;
		queue.offer(pRoot);
		
		while(!queue.isEmpty()){
			cur = queue.poll();
			list.add(cur.val);
			start ++;
			if(cur.left != null){
				queue.offer(cur.left);
			}
			if(cur.right != null){
				queue.offer(cur.right);
			}
			
			if(start == end){
				end = queue.size();
				start = 0;
				result.add(list);
				list = new ArrayList<Integer>();
			}
		}
		return result;
		
	}
}
