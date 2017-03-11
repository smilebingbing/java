package com.offer.java;

public class ReverseDoubleList {

	public DoubleNode reverseDoubleList(DoubleNode head){
		DoubleNode pre=null;
		DoubleNode after=null;
		while(head!=null){
			after=head.next;
			head.next=pre;
			head.last=after;
			pre=head;
			head=after;
		}
		return pre;
	}
}
