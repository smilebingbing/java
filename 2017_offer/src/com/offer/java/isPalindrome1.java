package com.offer.java;

import java.util.Stack;
//判断链表是否是回文结构
public class isPalindrome1 {

	public boolean isPalin(Node head){
		if(head == null || head.next == null){
			return true;
		}
		Stack<Node> stack=new Stack<Node>();
		Node p=head;
		Node p1=head.next;
		while(p.next!=null || p.next.next != null){
			p1=p1.next;
			p=p.next.next;
		}
		while(p1!=null){
			stack.push(p1);
			p1=p1.next;
		}
		while(!stack.isEmpty()){
			if(stack.pop().value==head.value){
				head=head.next;
			}else{
				return false;
			}
		}
		return true;
		
	}
}
