package com.org.tree;

import com.org.tree.BinaryTreeHeightBalanced.Node;

/*
 * An empty tree is height-balanced. A non-empty binary tree T is balanced if:
 * 1) Left subtree of T is balanced
 * 2) Right subtree of T is balanced
 * 3) The difference between heights of left subtree and right 
 * 	  subtree is not more than 1.
 */
public class IsBinaryTreeHeightBalanced {
	
	public static void main(String[] args) {
		BinaryTreeHeightBalanced tree = new BinaryTreeHeightBalanced();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Is Binary tree is Height Balanced : "
				+ tree.isHeightBalanced(root));
	}

}

class BinaryTreeHeightBalanced {
	
	Node root;
	
	static class Node {
		int data;
		Node left, right;
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public boolean isHeightBalanced(Node node){
		if(node == null)
			return true;
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		if(Math.abs(leftHeight - rightHeight) <= 1
				&& isHeightBalanced(node.left)
				&& isHeightBalanced(node.right))
			return true;
		
		return false;
	}
	
	public int height(Node node){
		if(node == null) return 0;
		if(node.left == null && node.right == null) return 1;
		return 1+ Math.max(height(node.left), height(node.right));
	}
}
