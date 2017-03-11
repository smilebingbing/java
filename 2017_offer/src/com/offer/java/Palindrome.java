package com.offer.java;

import java.util.Stack;

public class Palindrome {

	public boolean isPalindrome(Node head){
		Stack<Node> stack=new Stack<Node>();
		Node p=head;
		while(p!=null){
			stack.push(p);
			p=p.next;
		}
		while(head!=null){
			if(stack.pop().value==head.value){
				head=head.next;
			}else{
				return false;
			}
			
		}
		return true;
	}
}
