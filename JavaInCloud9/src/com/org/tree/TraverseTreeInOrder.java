package com.org.tree;

import java.util.Stack;

import com.org.tree.BinaryTreeInOrder.Node;

public class TraverseTreeInOrder {

	public static void main(String[] args) {
		BinaryTreeInOrder tree = new BinaryTreeInOrder();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(5);
		root.right.right = new Node(6);

		System.out.print("Inorder - ");
		tree.inOrder(root);
	}
}

class BinaryTreeInOrder {

	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public void inOrder(Node node){
		if(node == null)
			return;

		Stack<Node> stack = new Stack<>();
		Node current = node;

		while(current!=null || !stack.empty()){

			while(current != null){
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
	}
}
