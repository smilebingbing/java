package com.java.offer;

public class MergeNode {

	public Node merge(Node head1, Node head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1;
		}
		Node head = head1.value < head2.value ? head1 : head2;
		Node cur1 = head == head1 ? head1 : head2;
		Node cur2 = head == head1 ? head2 : head1;
		Node pre = null;
		Node after = null;
		while(cur1 != null && cur2 != null){
			if(cur1.value <= cur2.value){
				pre = cur1;
				cur1 = cur1.next;
			}else{
				after = cur2.next;
				pre.next = cur2;
				cur2.next = cur1;
				pre = cur2;
				cur2 = after;
			}
		}
		pre.next = cur1 == null ? cur2 :cur1;
		return head;
	}
}
