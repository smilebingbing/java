package com.offer.java;
//在单链表中删除倒数第k个节点
/*
 * public class Node{
 * 		public int value;
 *		public Node next;
 *		public Node(int data){
 *				this.value=data;
 *			}
 * }
 */

public class RemoveLastElement {
	public Node removeLastKthNode(Node  head,int lastkth){
		if(head==null||lastkth<1){
			return head;
		}
		Node p=head;
		while(p!=null){
			lastkth--;
			p=p.next;
		}
		if(lastkth==0){
			head=head.next;
		}
		if(lastkth<0){
			p=head;
			while(++lastkth!=0){
				lastkth++;
				p=p.next;
			}
			p.next=p.next.next;
		}
		return head;
		
	}
}

/*
 * public class DoubleNode(){
 * 		public int value;
 * 		public DoubleNode next;
 * 		public DoubleNode last;
 * 		public DoubleNode(int data){
 * 			this.value=data;
 * 			}
 * 
 * }
 * 
 * public DoubleNode RemoveDoubleLastKthNode(DoubleNode head,int lastkth){
 * 			if(head==null||lastkth<1){
 * 				return head;
 * 			}
 *        DoubleNode p=head;
 *        while(head!=null){
 *        		lastkth--;
 *        		head=head.next;
 *        }
 *        if(lastkth==0){
 *        		head=head.next;
 *        		head.last=null;
 *        }
 *        if(lastkth<0){
 *        		p=head;
 *        		while(++lastkth!=0){
 *        				p=p.next;
 *        				}
 *        		DoubleNode newNext=p.next.next;
 *        		p.next=newNext;
 *        }
 *        if(newNext!=null){
 *        		newNext.last=p;
 *        }
 *        return head;
 *        }
 *      }
 *    }
 *        
 */



























