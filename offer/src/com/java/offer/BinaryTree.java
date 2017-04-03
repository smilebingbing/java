package com.java.offer;
//
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	public static NodeTree init(){
		
		NodeTree I = new NodeTree(8,null,null);
		NodeTree H = new NodeTree(4,null,null);
		NodeTree G = new NodeTree(2,null,null);
		NodeTree F = new NodeTree(7,null,I);
		NodeTree E = new NodeTree(5,H,null);
		NodeTree D = new NodeTree(1,null,G);
		NodeTree C = new NodeTree(9,F,null);
		NodeTree B = new NodeTree(3,D,E);
		NodeTree A = new NodeTree(6,B,C);
		return A;
	}
	
	public static void printNode(NodeTree node){
		System.out.println(node.getValue());
	}
	//先序遍历
	public static void PreOrder(NodeTree root){
		printNode(root);
		if(root.getLeft() != null){
			PreOrder(root.getLeft());
		}
		if(root.getRight() != null){
			PreOrder(root.getRight());
		}
	}
	
	//中序遍历
	public static void InOrder(NodeTree root){
		if(root.getLeft() != null){
			InOrder(root.getLeft());
		}
		printNode(root);
		if(root.getRight() != null){
			InOrder(root.getRight());
		}
	}
	
	//后序遍历
	public static void PostOrder(NodeTree root){
		if(root.getLeft() != null){
			PostOrder(root.getLeft());
		}
		if(root.getRight() != null){
			PostOrder(root.getRight());
		}
		printNode(root);
	}
	
	public static void main(String[] args) {
		NodeTree root = init();
		
		System.out.println("先序遍历");
		PreOrder(root);
		System.out.println("");
		
		System.out.println("中序遍历");
		InOrder(root);
		System.out.println("");
		
		System.out.println("后序遍历");
		PostOrder(root);
		System.out.println("");
		
		System.out.println("非递归 先序遍历");
		PreOrder_stack(root);
		System.out.println("");
		
		System.out.println("非递归 中序遍历");
		InOrder_stack(root);
		System.out.println("");
		
		System.out.println("非递归 后序遍历");
		PostOrder_stack(root);
		System.out.println("");
		
		System.out.println("层次遍历");
		LevelOrder(root);
		System.out.println("");
		
	}
	
	//非递归的前序遍历
	public static void PreOrder_stack(NodeTree root){
		Stack<NodeTree> stack = new Stack<NodeTree>();
		NodeTree node = root;
		
		while(node != null || stack.size() > 0){
			if(node != null){
				printNode(node);
				stack.push(node);
				node = node.getLeft();
			}else{
				node = stack.pop();
				node = node.getRight();
			}
		}
	}
	
	//非递归的中序遍历
	public static void InOrder_stack(NodeTree root){
		Stack<NodeTree> stack = new Stack<NodeTree>();
		NodeTree node = root;
		
		while(node != null || stack.size() > 0){
			if(node != null){
				stack.push(node);
				node = node.getLeft();
			}else{
				node = stack.pop();
				printNode(node);
				node = node.getRight();
			}
		}
	}
	
	//非递归的后序遍历
	public static void PostOrder_stack(NodeTree root){
		Stack<NodeTree> stack = new Stack<NodeTree>();
		Stack<NodeTree> output = new Stack<NodeTree>();
		NodeTree node = root;
		
		while(node != null || stack.size() > 0){
			if(node != null){
				stack.push(node);
				output.push(node);
				node = node.getRight();
			}else{
				node = stack.pop();
				node = node.getLeft();
			}
		}
		
		while(!output.isEmpty()){
			printNode(output.pop());
		}
	}
	
	//层次遍历
	public static void LevelOrder(NodeTree root){
		LinkedList<NodeTree> queue = new LinkedList<NodeTree>();
		NodeTree cur = null;
		queue.offer(root);
		
		while(!queue.isEmpty()){
			cur = queue.poll();
			printNode(cur);
			if(cur.getLeft() != null){
				queue.offer(cur.getLeft());
			}
			if(cur.getRight() != null){
				queue.offer(cur.getRight());
			}
		}
				
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
