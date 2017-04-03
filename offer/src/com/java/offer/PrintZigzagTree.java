package com.java.offer;

import java.util.Deque;
import java.util.LinkedList;

public class PrintZigzagTree {

	public void printZigzagTree(Node1 head){
		if(head == null){
			return ;
		}
		Deque<Node1> deque = new LinkedList<Node1>();
		int level = 1;
		Node1 last = head;
		Node1 nlast = null;
		boolean lr =true;
		deque.addFirst(head);
		while(!deque.isEmpty()){
			if(lr){
				head = deque.pollFirst();
				if(head.left != null){
					nlast = nlast == null ? head.left : nlast;
					deque.addLast(head.left);
				}
				if(head.right != null){
					nlast = nlast == null ? head.right : nlast;
					deque.addLast(head.right);
				}
			}else{
				
			}
		}
	}
}
