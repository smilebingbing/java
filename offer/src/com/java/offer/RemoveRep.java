package com.java.offer;
//删除无序单链表中值重复出现的节点
/*
 * 如果链表长度为N,则时间复杂度是O(N)
 * 使用哈希表，将头结点存入哈希表，然后遍历单链表，如果哈希表中包含该节点，则删除，否则添加
 */
import java.util.HashSet;

public class RemoveRep {

	public void removeRep(Node head){
		if(head == null){
			return ;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		Node cur = head.next;
		Node pre = head;
		set.add(head.value);
		while(cur != null){
			if(set.contains(cur.value)){
				pre.next = cur.next;
			}else{
				set.add(cur.value);
				pre = cur;
			}
			cur = cur.next;
		}
		
	}
}
