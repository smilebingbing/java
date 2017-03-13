package model;

public class NoLoop {

	public Node noloop(Node head1, Node head2){
		Node cur1=head1;
		Node cur2=head2;
		int n=0;
		while(cur1!=null){
			n++;
			cur1=cur1.next;
		}
		while(cur2!=null){
			n--;
			cur2=cur2.next;
		}
		if(cur1 != cur2){
			return null;
		}
		cur1= n>0 ?head1 : head2;
		cur2=cur1 == head1 ?head2 : head1;
		n=Math.abs(n);
		while(n!=0){
			n--;
			cur1=cur1.next;
			
		}
		while(cur1 != cur2){
			cur1 = cur1.next;
			cur2= cur2.next;
		}
		return cur1;
	}
}
