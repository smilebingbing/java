package model;

public class AddList3 {

	public Node addList3(Node head1 , Node head2){
		head1=reverseList(head1);
		head2=reverseList(head2);
		int n1=0;
		int n2=0;
		int ca=0;
		int n=0;
		Node c1=head1;
		Node c2=head2;
		Node pre = null;
		Node p = null;
		while(c1 != null || c2 != null){
			
			n1=c1!=null ? c1.value : 0;
			n2=c2 != null ? c2.value : 0;
			n=n1+ n2 +ca;
			pre=p;
			p=new Node(n%10);
			p.next = pre;
			ca=n/10;
			c1 =c1 !=null ?c1.next :null;
			c2 =c2 !=null ?c2.next :null;
		}
		if(ca==1){
			pre=p;
			p=new Node(1);
			p.next = pre;
			
		}
		reverseList(head1);
		reverseList(head2);
		return p;
		
	}
	
	public Node reverseList(Node head){
		Node pre=null;
		Node p=null;
		while(head!=null){
			p=head.next;
			head.next=pre;
			pre=head;
			head=p;
		}
		return head;
	}
}
