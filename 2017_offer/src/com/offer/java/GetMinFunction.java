package com.offer.java;
//设计一个有getMin功能的栈

import java.util.Stack;

public class GetMinFunction {
	Stack<Integer> dataStack=new Stack<Integer>();
	Stack<Integer> minStack=new Stack<Integer>();
	
	public void push(int newNum){
		if(minStack.isEmpty()){
			minStack.push(newNum);
		}
		else if(this.getMin()>=newNum){
			minStack.push(newNum);
		}
		dataStack.push(newNum);
		
	}
	
	public int pop( ){
		if(dataStack.isEmpty()){
			throw new RuntimeException("dataStack is empty");
		}
		int value=dataStack.pop();
		if(value<=this.getMin()){
			minStack.pop();
		}
			return value;
		
		
	}
	
	public int getMin(){
		if(minStack.empty()){
			throw new RuntimeException("minStack is empty");
		}
		return minStack.peek();
	}
}
