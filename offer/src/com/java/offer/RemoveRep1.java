package com.java.offer;
//删除单链表中值重复的节点
/*
 * 基本思路：从单链表的第一个节点开始遍历，如果有与第一个节点值相同的点，就删除，然后删除与第二个节点值
 * 		相同的节点，
 * 时间复杂度为O(N^2),额外空间复杂度为O(1)
 */
public class RemoveRep1 {

	public void removeRep(Node head){
		Node cur = head;
		Node pre = null;
		Node after = null;
		while(cur != null){
			pre = cur;
			after = cur.next;
			while(after != null){
				if(pre.value == after.value){
					pre.next = after.next;
				}else{
					pre = after;
				}
				after = after.next;
			}
			cur = cur.next;
		}
	}
}