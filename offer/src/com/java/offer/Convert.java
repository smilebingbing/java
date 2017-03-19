package com.java.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Convert {

	public Node1 convert(Node1 head){
		Queue<Node1> queue = new LinkedList<Node1>();
		InOrder(head , queue);
		while(queue.isEmpty()){
			return head;
		}
		Node1 pre = head;
		pre.left = null;
		Node1 cur = head;
		while(!queue.isEmpty()){
			cur = queue.poll();
			pre.right = cur;
			cur.left = pre;
			pre = cur;
			
		}
		cur.right = null;
		return head;
		
	}
	
	public void InOrder(Node1 head, Queue<Node1> queue){
		if(head == null){
			return ;
		}
		InOrder(head.left, queue);
		queue.offer(head);
		InOrder(head.right, queue);
	}
}
