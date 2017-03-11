package com.offer.java;

import java.util.Stack;

//由两个栈组成的队列
public class TwoStackQueue {
	Stack<Integer> stackpush=new Stack<Integer>();
	Stack<Integer> stackpop=new Stack<Integer>();
	
	public void add(int node){
		stackpush.push(node);
	}
	
	public int poll(){
		if(stackpop.empty()&&stackpush.isEmpty()){
			throw new RuntimeException("queue is null");
		}
		if(stackpop.isEmpty()){
			while(!stackpush.isEmpty()){
				stackpop.push(stackpush.pop());
			}
			
		}
		return stackpop.pop();
	}
	
	public int peek(){
		if(stackpop.isEmpty()&&stackpush.isEmpty()){
			throw new RuntimeException("queue is null");
		}else if(stackpop.empty()){
			while(!stackpush.isEmpty()){
				stackpop.push(stackpush.pop());
			}
		}
		return stackpop.peek();
	}
}
