package com.java.offer;
//二叉树的下一个节点

/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution31 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null){
        	return null;
        }
        TreeLinkNode p = null;
        //这个节点有右子树，那么它的下一个节点就是右孩子的左孩子
        if(pNode.right != null){
        	p = pNode.right;
        	while(p.left != null){
        		p = p.left;
        	}
        	return p;
        }
        
        while(pNode.next!=null)
        {
            if(pNode.next.left==pNode)return pNode.next;
            pNode=pNode.next;
        }
        return null;
    }
}