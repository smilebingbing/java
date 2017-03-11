package com.offer.java;
//反转单向链表
public class ReverseList {

	public Node reverseList(Node head){
		Node pre=null;
		Node after=null;
		while(head!=null){
			after=head.next;
			head.next=pre;
			pre=head;
			head=after;
			
		}
		return pre;
	}
}
