package com.org.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.org.tree.BinaryTreeLevelOrder.Node;

public class TraverseTreeLevelOrder {

	public static void main(String[] args) {
		BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.print("Level Order - ");
		tree.levelOrder(root);
	}
}

class BinaryTreeLevelOrder {

	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}

	public void levelOrder(Node node){
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);

		while(!queue.isEmpty()) {
			Node current = queue.remove();
			System.out.print(current.data + " ");
			
			if(current.left != null)
				queue.add(current.left);
			if(current.right != null)
				queue.add(current.right);
		}
	}

}