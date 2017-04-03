package com.java.offer;

import java.util.ArrayList;
import java.util.Stack;

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
public class TreeType {

	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(pRoot == null){
			return result;
		}
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		stack1.add(pRoot);
		while(!stack1.isEmpty() || !stack2.isEmpty()){
			if(! stack1.isEmpty()){
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				while(!stack1.isEmpty()){
				
				TreeNode p = stack1.pop();
				list1.add(p.val);
				if(p.left != null){
					stack2.add(p.left);
				}
				if(p.right != null){
					stack2.add(p.right);
				}
				
				
				}
				result.add(list1);
			}else{
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				while(! stack2.isEmpty()){
					TreeNode p =stack2.pop();
					if(p.right != null){
						stack1.add(p.right);
					}
					if(p.left != null){
						stack1.add(p.left);
					}
					list2.add(p.val);
				}
				result.add(list2);
			}
		}
		return result;
	}
}
