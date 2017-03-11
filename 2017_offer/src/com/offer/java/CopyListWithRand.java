package com.offer.java;

import java.util.HashMap;

public class CopyListWithRand {

	public Node copyListWithRand(Node head){
		HashMap<Node,Node> map=new HashMap<Node,Node>();
		Node p=head;
		while(p!= null){
			map.put(p, new Node(p.value));
			p=p.next;
		}
		p=head;
		while(p!=null){
			map.get(p).next=map.get(p.next);
			map.get(p).rand=map.get(p.rand);
			p=p.next;
		}
		return map.get(head);
	}
}
