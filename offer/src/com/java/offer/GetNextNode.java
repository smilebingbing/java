package com.java.offer;

public class GetNextNode {



	public static Node1 getNextNode(Node1 node){
		if(node == null){
			return node;
		}
		if(node.right != null){
			return getNextNode(node.right);
		}else{
			Node1 p = node.parent;
			while(p != null && p.left != node){
				node = p;
				node = node.parent;
			}
			return p;
		}
		
		
	}
	
	public Node1 getMostLeft(Node1 node){
		if(node == null){
			return node;
		}
		while(node.left != null){
			node = node.left;
		}
		return node;
	}

}
