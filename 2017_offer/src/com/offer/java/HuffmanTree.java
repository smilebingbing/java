package com.offer.java;

import java.util.Scanner;

public class HuffmanTree {

	private HNode[] data;
	private int leafNum;
	
	//判断是否是叶子节点
	public boolean isLeaf(HNode p){
		return((p!=null)&&(p.getLchild()==-1)&&(p.getRchild()==-1));
	}
	
	//构造哈夫曼树
	public void create(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要传输的报文:");
		String str=sc.nextLine().toLowerCase();
		str=str.replace(" ","");
		int [] c = new int[26];
		for(int i =0;i< str.length();i++){
			c[str.charAt(i)-'a']++;
		}
		
		int cnt=0;
		for(int i=0;i<26;i++){
			if(c[i]>0){
				cnt++;
			}
		}
		
		this.leafNum = cnt;
		
		data = new HNode[this.leafNum*2-1];
		
	}
}
