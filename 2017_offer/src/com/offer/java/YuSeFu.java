package com.offer.java;

public class YuSeFu {

	public Node josie(Node head,int m){
		if(head==null|| head.next==head|| m<1){
			return head;
		}
		Node p=head;
		while(p.next!=head){
			p=p.next;
		}
		int count=0;
		while(head!=p){
			if(++count==m){
				p.next=head.next;
				count=0;
			}else{
				p=p.next;
			}
			head=p.next;
		}
		return head;
	}
}
