package com.org.tree;

import java.util.Stack;
import com.org.tree.BinaryTreePostOrder.Node;

/*
 * In this approach, we have used 2 stacks.
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 * Though we have used 2 stacks, but it is similar to 1 stack, as
 * we do not store any element in both the stack.
 */
public class TraverseTreePostOrder {
	
	public static void main(String[] args) {
		BinaryTreePostOrder tree = new BinaryTreePostOrder();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(5);
		root.right.right = new Node(6);
		
		System.out.print("Postorder - ");
		tree.postOrder(root);
	}

}

class BinaryTreePostOrder {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public void postOrder(Node node){
		
		if(node == null)
			return;
		
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack1.push(node);
		
		while(!stack1.empty()){
			Node current = stack1.pop();
			stack2.push(current);
			if(current.left != null)
				stack1.push(current.left);
			if(current.right != null)
				stack1.push(current.right);
		}
		
		while(!stack2.empty()){
			Node current = stack2.pop();
			System.out.print(current.data+ " ");
		}
	}
}