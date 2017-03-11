package com.offer.java;

public class isPalindrome2 {

	public boolean isPalindrome2(Node head){
		Node n1=head;
		Node n2=head;
		while(n2.next!=null && n2.next.next!=null){
			n1=n1.next;//中间点
			n2=n2.next.next;//结尾
		}
		n2=n1.next;
		Node n3=null;
		n1.next=null;
		while(n2!=null){
			n3=n2.next;
			n2.next=n1;
			n1=n2;
			n2=n3;
		}
		n3=n1;
		n2=head;
		boolean res=true;
		while(n1!=null && n2!=null){
			if(n1.value != n2.value){
				res=false;
				break;
			}
			n1=n1.next;
			n2=n2.next;
		}
		n3.next=n1;
		n3.next=null;
		while(n1!=null){
			n2=n1.next;
			n1.next=n3;
			n3=n1;
			n1=n2;
		}
		return res;
	}
}
