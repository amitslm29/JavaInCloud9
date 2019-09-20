package com.org.tree;

import com.org.tree.BinaryTreeDiameter.Node;

/*
 * Diameter is the number of nodes in the longest path of a Binary tree.
 * It is not necessary, diameter always passes through root.
 * If Diameter passes through root,
 * Diameter = 1 + Height of left subtree + Height of right subtree
 * If Diameter does not pass through root,
 * Diameter = 
 */
public class DiameterOfBinaryTree {
	
	public static void main(String[] args) {
		BinaryTreeDiameter tree = new BinaryTreeDiameter();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.print("Diameter of Tree - " + tree.diameter(root));
	}
}

class BinaryTreeDiameter {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public int diameter(Node node){
		if(node == null)
			return 0;
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		int leftDiameter = diameter(node.left);
		int rightDiameter = diameter(node.right);
		
		return Math.max(1 + leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
	}
	
	public int height(Node node){
		if(node == null)
			return 0;
		return 1 + Math.max(height(node.left),height(node.right));
	}
}
