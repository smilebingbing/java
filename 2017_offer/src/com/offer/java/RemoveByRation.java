package com.offer.java;

public class RemoveByRation {

	public Node removeByRatio(Node head,int a,int b){
		if(a<1 || a > b){
			return head;
		}
		int n=0;
		Node p=head;
		while(p!=null){
			n++;
			p=p.next;
		}
		n=(int) Math.ceil(((double)(a*n))/(double)(b));
		if(n == 1){
			head=head.next;
		}
		if(n>1){
			p=head;
			while(--n!=1){
				p=p.next;
				
			}
			p.next=p.next.next;
		}
		return head;
	}
}
