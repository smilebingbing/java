package com.java.offer;

import java.util.Stack;

public class ReverseK {

	public Node reverseKNode(Node head , int k){
		if(k < 2){
			return head;
		}
		
		Stack<Node> stack = new Stack<Node>();
		Node newHead = head;
		Node cur = head;
		Node pre = null;
		Node after = null;
		while(cur != null){
			after = cur.next;
			stack.push(cur);
			cur = cur.next;
			if(stack.size() == k){
				stack.pop();
				
			}
		}
	}
}