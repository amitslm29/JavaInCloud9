package com.org.tree;

import java.util.Stack;

import com.org.tree.BinaryTreeZigzag.Node;

/*
 * Spiral order or Zigzag order traversal
 */
public class TraverseTreeZigzagOrSpiralOrder {
	
	public static void main(String[] args) {
		BinaryTreeZigzag tree = new BinaryTreeZigzag();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.print("Zigzag Traversal - ");
		tree.zigZag(root);
	}

}

class BinaryTreeZigzag {

	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void zigZag(Node node){

		if(node == null)
			return;

		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();

		stack1.push(node);

		while(!stack1.empty() || !stack2.empty()){

			while(!stack1.empty()){
				Node current = stack1.pop();
				System.out.print(current.data + " ");

				if(current.left != null)
					stack2.push(current.left);
				if(current.right != null)
					stack2.push(current.right);
			}

			while(!stack2.empty()){
				Node current = stack2.pop();
				System.out.print(current.data + " ");

				if(current.right != null)
					stack1.push(current.right);
				if(current.left != null)
					stack1.push(current.left);
			}

		}
	}
}
