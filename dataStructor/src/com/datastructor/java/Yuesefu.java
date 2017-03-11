package com.datastructor.java;

import java.util.Scanner;

//单链表——————约瑟夫问题：设有n个人围成一圈，从第s个人开始报数，数到m的人出列，然后再从
//          下一个人开始报数，数到m的人又出列，如此重复，直到所有的人都出列为止。要求按出列的先后顺序输出每个人的信息
/*
public class Yuesefu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入参与的总人数：");
		int n=sc.nextInt();
		System.out.println("请输入出列的数字：");
		int m=sc.nextInt();
		
		Boolean[] rs=new Boolean[n];
		for(int i=0;i<n;i++){
			rs[i]=true;
		}
		int x=0;
		while(n>1){
			for(int i=0;i<n;i++){
				if(rs[i]){
					x++;
					if(x==m){
						x=0;
						rs[i]=false;
						n--;
						System.out.println(i+1);
					}
				}
			}
		}
		
		
	}

}
*/

public class Yuesefu{
	public static void main(String args[]){
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入总人数：");
		int totalNum=sc.nextInt();
		System.out.println("请输入报数的大小：");
		int cycleNum=sc.nextInt();*/
		
		getNode(5000,3);
	}
	
	private static class Node{
		protected Node next;
		public int data;
		
		public Node(int data){
			this.data=data;
			}
	}
	
	public static int getNode(int totalNum,int cycleNum){
		Node head=new Node(1);
		Node pointer=head;
		for(int i=2;i<=totalNum;i++){
			pointer.next=new Node(i);
			pointer=pointer.next;
		}
		pointer.next=head;
		while(pointer!=pointer.next){
			for(int i=1;i<cycleNum;i++){
				pointer=pointer.next;
			}
			System.out.print(pointer.next.data+" ");
			pointer.next=pointer.next.next;
		}
		return 0;
	}
}