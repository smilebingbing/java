package com.java.offer;

public class RemoveValue {

	public Node removeValue(Node head, int num){
		//先做判断，要找到一个值不等于num的点作为头结点
		while(head != null){
			if(head.value != num){
				break;
			}
			head = head.next;
		}
		Node pre = head;
		Node cur = head;
		while(cur != null){
			if(cur.value == num){
				pre.next = cur.next;
			}else{
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}
}
