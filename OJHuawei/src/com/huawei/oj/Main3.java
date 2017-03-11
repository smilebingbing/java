package com.huawei.oj;

import java.util.Scanner;

public class Main3 {

	private static class ListNode{
		int key;
		ListNode next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLong()){
			int num=sc.nextInt();
			int h=sc.nextInt();
			ListNode head=new ListNode();
			head.key=h;
			
			for(int i=0;i<num-1;i++){
				int beforeval=sc.nextInt();
				int afterval=sc.nextInt();
				addNode(beforeval,afterval,head);
			}
			
			int del=sc.nextInt();
			
			head=delete(del,head);
			System.out.println(getString(head));
			
		}
		sc.close();
	}
	
	private static String getString(ListNode head){
		StringBuilder builder=new StringBuilder();
		
		while(head!=null){
			builder.append(head.key).append(' ');
			head=head.next;
		}
		return builder.toString();
	}
	
	private static void addNode(int beforeval,int afterval,ListNode head){
		ListNode n=head;
		while(n!=null){
			if(n.key==afterval){
				ListNode node=new ListNode();
				node.key=beforeval;
				node.next=n.next;
				n.next=node;
				break;
			}
			n=n.next;
		}
	}

	private static ListNode delete(int val,ListNode head){
		if(head.key==val){
			ListNode ret=head.next;
			head.next=null;
			return ret;
		}else{
			ListNode prev=head;
			while(prev.next!=null){
				if(prev.next.key==val){
					prev.next=prev.next.next;
					break;
				}
				prev=prev.next;
			}
			return head;
		}
	}
}
