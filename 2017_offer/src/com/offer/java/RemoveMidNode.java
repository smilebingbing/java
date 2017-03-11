package com.offer.java;
//删除链表的中间结点和a/b处的节点
/*
 * public class Node{
 * 		public int value;
 * 		public Node next;
 * 		public Node(int data){
 * 			this.value=data;
 * 			}
 * 	}
 */

public class RemoveMidNode {
	public Node removeMidNode(Node head){
		if(head==null||head.next==null){
			return head;
		}
		if(head.next.next==null){
			return head.next;
		}
		Node pre=head;
		Node cur=head.next.next;
		while(cur.next!=null&&cur.next.next != null){
			pre=pre.next;
			cur=cur.next.next;
		}
		pre.next=pre.next.next;
		return head;
			
	}
}
