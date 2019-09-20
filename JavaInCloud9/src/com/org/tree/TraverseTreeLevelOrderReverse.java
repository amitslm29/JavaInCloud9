package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import com.org.tree.BinaryTreeLevelOrderReverse.Node;

/*
 * Approach - Use level order traversal
 * Instead of printing, push each element to the stack
 * At the end, pop all elements from stack
 */
public class TraverseTreeLevelOrderReverse {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		BinaryTreeLevelOrderReverse tree = new BinaryTreeLevelOrderReverse();
		tree.levelOrderReverse(root);
	}
}

class BinaryTreeLevelOrderReverse {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		public Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void levelOrderReverse(Node node){
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node current = queue.remove();
			stack.push(current);
			if(current.right != null)
				queue.add(current.right);
			if(current.left != null)
				queue.add(current.left);
		}
		while(!stack.empty())
			System.out.print(stack.pop().data + " ");
	}
}
