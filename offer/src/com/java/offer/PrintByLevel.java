package com.java.offer;
/*
 * 按层打印二叉树，
 * 格式如下：
 * Level 1 : 1
 * Level 2 : 2 3
 * Level 3 : 4 5 6
 * Level 4 : 7 8
 */
import java.util.LinkedList;
import java.util.Queue;

public class PrintByLevel {

	public void printByLevel(Node1 head){
		if(head == null){
			return ;
		}
		Queue<Node1> queue = new LinkedList<Node1>();
		int level = 1;
		Node1 last = head;
		Node1 nlast = null;
		queue.offer(head);
		System.out.println("Level"+ (level++) +":");
		while(!queue.isEmpty()){
			head = queue.poll();
			System.out.print(head.value + " ");
			if(head.left != null){
				queue.offer(head.left);
				nlast = head.left;
			}
			if(head.right != null){
				queue.offer(head.right);
				nlast = head.right;
			}
			if(head == last && !queue.isEmpty()){
				System.out.print("\nLevel" + (level++) + " ");
				nlast = last;
			}
		}
		System.out.println();
	}
}
