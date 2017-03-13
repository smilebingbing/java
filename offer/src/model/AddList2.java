package model;

import java.util.Stack;

public class AddList2 {

	public Node addLists(Node head1, Node head2){
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		while(head1 != null){
			stack1.push(head1.value);
			head1=head1.next;
			
		}
		while(head2 != null){
			stack2.push(head2.value);
			head2=head2.next;
		}
		int ca = 0;
		int n1 = 0;
		int n2 = 0;
		int n = 0;
		Node p = null;
		Node pre = null;
		
		while(!stack1.isEmpty() || !stack2.isEmpty()){
			n1=stack1.empty() ? 0 :stack1.pop();
			n2=stack2.empty() ? 0 :stack2.pop();
			n=n1+n2+ca;
			pre=p;
			p=new Node(n%10);
			p.next=pre;
			ca=n/10;
		}
		if(ca==1){
			pre=p;
			p=new Node(1);
			p.next=pre;
		}
		return p;
	}
}
