package com.offer.java;

public class HNode {

	private int weight;
	private int lchild;
	private int rchild;
	private int parent;
	private String name;
	private String code;
	
	//构造器
	public HNode(String name,int w) {
		// TODO Auto-generated constructor stub
		this.weight=w;
		this.name=name;
		this.lchild=-1;
		this.rchild=-1;
		this.parent=-1;
		this.code="";
	}
	
	public HNode() {
		this(null, 0);
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLchild() {
		return lchild;
	}

	public void setLchild(int lchild) {
		this.lchild = lchild;
	}

	public int getRchild() {
		return rchild;
	}

	public void setRchild(int rchild) {
		this.rchild = rchild;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}
