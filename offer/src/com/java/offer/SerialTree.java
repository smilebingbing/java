package com.java.offer;
//二叉树的序列化
public class SerialTree {

	public String serialTree(TreeNode head){
		if(head == null){
			return "#!";
		}
		String res = head.val+ "!";
		res += serialTree(head.left);
		res += serialTree(head.right);
		return res;
	}
}
