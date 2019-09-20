package com.org.tree;

import java.util.Stack;

import com.org.tree.BinaryTreeLeafNodes.Node;

public class PrintLeafNodes {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		
		BinaryTreeLeafNodes tree = new BinaryTreeLeafNodes();
		tree.printLeafNodesLefttoRight(root);
		System.out.println();
		tree.printLeafNodesRightToLeft(root);
	}

}

class BinaryTreeLeafNodes {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void printLeafNodesLefttoRight(Node node){
		if(node == null)
			return;
		
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		
		while(!stack.empty()){
			Node current = stack.pop();
			if(current.right != null)
				stack.push(current.right);
			if(current.left != null)
				stack.push(current.left);
			if(current.left == null && current.right == null)
				System.out.print(current.data + " ");
		}
	}
	
	public void printLeafNodesRightToLeft(Node node){
		if(node == null)
			return;
		
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		
		while(!stack.empty()){
			Node current = stack.pop();
			if(current.left != null)
				stack.push(current.left);
			if(current.right != null)
				stack.push(current.right);
			if(current.left == null && current.right == null)
				System.out.print(current.data + " ");
		}
	}
	
	public void printLeafNodesLefttoRightUsingRecursion(Node node){
		if(node == null)
			return;
		
		if(node.left == null && node.right == null)
			System.out.print(node.data + " ");
		
		printLeafNodesLefttoRight(node.left);
		printLeafNodesLefttoRight(node.right);
	}
}
