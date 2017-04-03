package com.java.offer;

public class NodeSelect {

	public static Node selectSort(Node head){
		Node tail = null;
		Node cur = head;
		Node smallPre = null;
		Node small = null;
		while(cur != null){
			small = cur;
			
		}
		return ;
	}
	
	public Node getSmallestPreNode(Node head){
		Node smallpre = null;
		Node small = head;
		Node pre = head;
		Node cur = head.next;
		while(cur != null){
			if(cur.value < small.value){
				smallpre = pre;
				small = cur;
			}
			pre = small;
			cur = cur.next;
		}
		return smallpre;
	}
}
