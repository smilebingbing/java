package com.offer.java;

import java.util.Stack;

public class sortStackByStack {
	public static void sortStack(Stack<Integer> stack){
		Stack<Integer> help=new Stack<Integer>();
		/*if(help.empty()){
			help.push(stack.pop());
		}else if(stack.pop()<=help.peek()){
			help.push(stack.pop());
		}else if(stack.pop()>help.peek()){
			while(!help.isEmpty()){
				stack.push(help.pop());
			}
		}*/
		
		
		while(!stack.empty()){
			int cur=stack.pop();
			while(!help.isEmpty()&&help.peek()<cur){
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.empty()){
			stack.push(help.pop());
		}
	}
}
