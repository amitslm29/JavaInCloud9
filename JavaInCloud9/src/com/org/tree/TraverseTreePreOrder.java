package com.org.tree;

import java.util.Stack;
import com.org.tree.BinaryTreePreOrder.Node;

public class TraverseTreePreOrder {

	public static void main(String[] args) {
		BinaryTreePreOrder tree = new BinaryTreePreOrder();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(5);
		root.right.right = new Node(6);

		System.out.print("Preorder - ");
		tree.preOrder(root);
	}

}

class BinaryTreePreOrder {

	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void preOrder(Node node) {
		if(node == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(node);

		while(!stack.empty()){
			Node current = stack.pop();
			System.out.print(current.data + " ");

			if(current.right != null)
				stack.push(current.right);
			if(current.left != null)
				stack.push(current.left);

		}
	}
}
