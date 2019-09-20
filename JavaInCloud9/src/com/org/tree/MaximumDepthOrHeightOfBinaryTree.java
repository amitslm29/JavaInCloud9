package com.org.tree;

import com.org.tree.BinaryTreeHeight.Node;

/*
 * Height of Tree is also called as Maximum depth
 */
public class MaximumDepthOrHeightOfBinaryTree {

	public static void main(String[] args) {
		BinaryTreeHeight tree = new BinaryTreeHeight();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.print("Height or Maximum Depth of given Tree - " + tree.height(root));
	}
}

class BinaryTreeHeight {
	
	Node root;
	
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public int height(Node node){
		if(node == null)
			return 0;
		
		if(node.left == null && node.right == null)
			return 1;
		
		return Math.max(height(node.left), height(node.right)) + 1;
	}
}
