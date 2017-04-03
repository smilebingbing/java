package com.java.offer;
//向有序的环形链表中插入新节点
/*
 * 基本思路：1.环形链表为空时，那么新节点自己构成环形链表
 * 		2. 设置两个变量，一个头结点，一个指向头结点的下一个节点，遍历，若新节点的值在这两个
 * 			节点值之间，那么插入新节点
 * 		3.若不在这两个节点之间，说明新节点要么是最大的，要么是最小的，将它插入到原头结点的前面
 * 		4.最后判断一下头结点和新节点的值大小，若新节点的值比头结点值小，则返回新节点
 */
public class NodeInsert {

	public static Node insertNum(Node head, int num){
		Node p = null;
		p.value = num;
		if(head == null){
			p.next = p;
			return p;
		}
		Node pre = head;
		Node cur = head.next;
		while(cur != head){
			if(num >= pre.value && num <= cur.value){
				break;
			}
			pre = cur;
			cur = cur.next;
		}
		pre.next = p;
		p.next = cur;
		return head.value > num ? p : head;
		
	}
}
