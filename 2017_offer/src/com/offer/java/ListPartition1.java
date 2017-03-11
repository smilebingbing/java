package com.offer.java;

public class ListPartition1 {

	public Node listPartition1(Node head,int pivot){
		int len=0;
		Node p=head;
		while(p!=null){
			len++;
			p=p.next;
		}
		Node [] nodeArr=new Node[len];
		p=head;
		for(int i=0;i<nodeArr.length;i++){
			nodeArr[i]=p;
			p=p.next;
		}
		arrPartition(nodeArr, pivot);
		for(int i=1;i<len;i++){
			nodeArr[i-1].next=nodeArr[i];
			
		}
		nodeArr[len-1].next=null;
		return head;
	}
	
	public void swap(Node [] nodeArr,int a ,int b){
		Node temp=nodeArr[a];
		nodeArr[a]=nodeArr[b];
		nodeArr[b]=temp;
	}
	
	public void arrPartition(Node [] nodeArr,int pivot){
		int index=0;
		int left=-1;
		int right=nodeArr.length;
		if(nodeArr[index].value<pivot){
			swap(nodeArr,++left,index++);
		}
		else if(nodeArr[index].value==pivot){
			index++;
		}
		else{
			swap(nodeArr,--right,index);
		}
	}
}
