package com.java.offer;
//按之字形顺序打印二叉树
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

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
//运行时间37ms
//占用内存699k
//海量数据时，效率太低
public class Solution30 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {

    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	if(pRoot == null){
    		return result;
    	}
    	TreeNode cur = null;
    	queue.offer(pRoot);
    	int start = 0;
    	int end = 1;
    	boolean leftToright = true;
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
    			if(!leftToright){
    				result.add(reverse(list));
    			}else{
    				result.add(list);
    			}
    			leftToright = !leftToright;
    			list = new ArrayList<Integer>();
    			start = 0;
    		}
    			
    	}
    	
    	return result;
    	
    }
    
    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
    	ArrayList<Integer> li = new ArrayList<Integer>();
    	for(int i = list.size()-1; i >= 0;i --){
    		li.add(list.get(i));
    	}
    	return li;
    }
    

}
