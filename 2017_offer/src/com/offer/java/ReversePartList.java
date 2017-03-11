package com.offer.java;
//反转部分链表
public class ReversePartList {

	public Node reversePart(Node head,int from, int to){
		int len=0;
		Node fPre=null;
		Node tPos=null;
		Node p=head;
		while(p!=null){
			len++;
			fPre=len==from-1? p:fPre;
			tPos=len==to+1 ? p:tPos;
			p=p.next;
		}
		p=fPre==null ? head :fPre.next;
		Node p1=p.next;
		p.next=tPos;
		Node p2=null;
		while(p1!=tPos){
			p2=p1.next;
			p1.next=p;
			p=p1;
			p1=p2;
		}
		if(fPre!=null){
			fPre.next=p;
		}
		return head;
	}
}
