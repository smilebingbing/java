package model;
import java.util.Stack;
import java.util.ArrayList;
public class Solution1 {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      Stack<Integer> stack=new Stack<Integer>();
	      int index=0;
	      for(int i=0;i<pushA.length;i++){
	    	  stack.push(pushA[i]);
	    	  while(!stack.empty()&&stack.peek()==popA[index]){
	    		  stack.pop();
	    		  index++;
	    	  }
	      }
	      
	      return stack.empty();
    }
}
