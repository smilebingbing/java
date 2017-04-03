package com.java.offer;
//一种怪异的节点删除方式
/*
 * 给定一个链表中的节点node，但不给定整个链表的头结点，如何在链表中删除node?
 */
public class RemoveNodeWired {

	public void removeNodeWired(Node node){

		if(node == null){
			return ;
		}
		Node after = node.next;
		if(after == null){
			throw new RuntimeException("can not remove last node");
		}
		node.value = after.value;
		node.next = after.next;
		
	}
}
