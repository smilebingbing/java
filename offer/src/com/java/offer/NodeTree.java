package com.java.offer;

public class NodeTree {

	public int value;
	public NodeTree left;
	public NodeTree right;
	
	public NodeTree(int value, NodeTree left, NodeTree right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public NodeTree getLeft() {
		return left;
	}

	public void setLeft(NodeTree left) {
		this.left = left;
	}

	public NodeTree getRight() {
		return right;
	}

	public void setRight(NodeTree right) {
		this.right = right;
	}
	
	
	
}
